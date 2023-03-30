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

    public boolean controleerAntwoord(List<String> antwoord) {
        return false;
    }

    private List<String> getCorrecteAntwoorden(int vraagNummer) {
        return null;
    }
}
