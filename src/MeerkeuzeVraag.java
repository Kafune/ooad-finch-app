import java.util.List;

public class MeerkeuzeVraag extends Vraag {
    private String vraag;

    public List<String> getAntwoorden() {
        return antwoorden;
    }

    private List<String> antwoorden;
    private String juisteAntwoord;

    public MeerkeuzeVraag(String huidigeVraag, List<String> antwoorden, String correctAntwoord) {
        this.vraag = huidigeVraag;
        this.antwoorden = antwoorden;
        this.juisteAntwoord = correctAntwoord;
    }
    @Override
    public String getVraag() {
        return vraag;
    }

    public boolean controleerAntwoord(String antwoord) {
        return true;
    }

    private String getCorrectAntwoord() {
        return null;
    }
}
