import java.util.List;

public class Quiz {
    private Puntensysteem puntensysteem;
    private int aantalCorrecteAntwoorden;

    public Quiz(List<Vraag> vragen) {
        puntensysteem.setPuntenStrategy(new Initieel());
    }

//    public Antwoord geefAntwoord(String antwoord, Vraag vraag) {
//        return new Antwoord(antwoord, vraag);
//    }

    public int getAantalCorrecteAntwoorden() {
        return aantalCorrecteAntwoorden;
    }
}
