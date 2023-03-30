public class Quiz {
    private int aantalCorrecteAntwoorden;
    private Vragenlijst vragenlijst;

    Tijd tijd;

    public Quiz(Vragenlijst vragen) {
        this.vragenlijst = vragen;
        tijd = new Tijd();
    }
    public Tijd getTijd() {
        return tijd;
    }
    public void setVragen(Vragenlijst vragen) {
        this.vragenlijst = vragen;
    }
    public Vragenlijst getVragenlijst() {
        return vragenlijst;
    }
    public void beantwoordVraag(int i, String antwoord) {
        Antwoord gegevenAntwoord = new Antwoord(vragenlijst.vragen.get(i), antwoord);
        Vraag huidigeVraag = vragenlijst.vragen.get(i);
        var isCorrect = huidigeVraag.controleerAntwoord(antwoord);
        System.out.println(gegevenAntwoord.getAntwoord());
        if (isCorrect) {
            aantalCorrecteAntwoorden += 1;
        }
    }

    public void rondQuizAf() {
        String afrondingsTijd = tijd.stopDoorloopTijd();
        Puntensysteem puntensysteem = new Puntensysteem();
        puntensysteem.setPuntenStrategy(new Initieel());
        int extraPunten = puntensysteem.berekenBonus(aantalCorrecteAntwoorden, controleerAlleVragenGoed(), tijd);
        int totaalScore = puntensysteem.berekenTotaal(extraPunten);
        System.out.println("Je hebt " + totaalScore + " punten behaald!");
        System.out.println(afrondingsTijd);
    }

    public boolean controleerAlleVragenGoed(){
        return aantalCorrecteAntwoorden == 10;
    }

}
