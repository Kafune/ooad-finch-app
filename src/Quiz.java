import java.util.List;

public class Quiz {
    private Puntensysteem puntensysteem = new Puntensysteem();
    private int aantalCorrecteAntwoorden;
    private List<Vraag> vragen;

    public Quiz(List<Vraag> vragen) {
        this.vragen = vragen;
        puntensysteem.setPuntenStrategy(new Initieel());
    }

    public void beantwoordVraag(int i, String antwoord){
        Antwoord gegevenAntwoord = new Antwoord(vragen.get(i), antwoord);
        Vraag huidigeVraag = vragen.get(i);
        var isCorrect = huidigeVraag.controleerAntwoord(antwoord);
        System.out.println(gegevenAntwoord.getAntwoord());
        if (isCorrect) {
            aantalCorrecteAntwoorden += 1;
        }
    }
    public boolean controleerAlleVragenGoed(){
        return aantalCorrecteAntwoorden == 10;
    }

    public int getAantalCorrecteAntwoorden() {
        return aantalCorrecteAntwoorden;
    }
}
