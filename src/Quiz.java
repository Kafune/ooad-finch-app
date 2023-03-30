import java.util.List;

public class Quiz {
    private Puntensysteem puntensysteem = new Puntensysteem();
    private int aantalCorrecteAntwoorden;
    private Vragenlijst vragen;

    Tijd tijd;

    public Quiz(Vragenlijst vragen) {
        tijd = new Tijd();
        puntensysteem.setPuntenStrategy(new Initieel());

    }

    public Tijd getTijd() {
        return tijd;
    }
    public void setVragen(Vragenlijst vragen) {
        this.vragen = vragen;
    }
    public void beantwoordVraag(int i, String antwoord){
//        Antwoord gegevenAntwoord = new Antwoord(vragen.get(i), antwoord);
//        Vraag huidigeVraag = vragen.get(i);
//        var isCorrect = huidigeVraag.controleerAntwoord(antwoord);
//        System.out.println(gegevenAntwoord.getAntwoord());
//        if (isCorrect) {
//            aantalCorrecteAntwoorden += 1;
//        }
    }
    public boolean controleerAlleVragenGoed(){
        return aantalCorrecteAntwoorden == 10;
    }

    public Vragenlijst getVragenlijst() {
        return vragen;
    }

    public int getAantalCorrecteAntwoorden() {
        return aantalCorrecteAntwoorden;
    }
}

