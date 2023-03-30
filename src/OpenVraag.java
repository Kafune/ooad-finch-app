import java.util.List;

public class OpenVraag extends Vraag {
    private List<String> antwoorden;
    private int vraagNummer;
    private String huidigeVraag;

    public OpenVraag(String huidigeVraag, List<String> antwoorden) {
        this.huidigeVraag = huidigeVraag;
        this.antwoorden = antwoorden;
    }
    @Override
    public String getVraag() {
        return huidigeVraag;
    }

    @Override
    public boolean controleerAntwoord(String antwoord) {
        return true;
    }

    private List<String> getCorrecteAntwoorden(int vraagNummer) {
        return null;
    }
}
