import java.util.List;

public class MeerkeuzeVraag extends Vraag {
    private String vraag;
    private String[] antwoorden;
    private String juisteAntwoord;

    public MeerkeuzeVraag(String huidigeVraag, List<String> antwoorden, String correctAntwoord) {

    }
    @Override
    public Vraag getVraag(String vraagnummer) {
        return null;
    }

    public boolean controleerAntwoord(String antwoord) {
        return false;
    }

    private String getCorrectAntwoord() {
        return null;
    }
}
