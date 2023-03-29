import java.util.List;

public class OpenVraag extends Vraag {
    private List<String> antwoorden;
    private int vraagNummer;

    public OpenVraag(String huidigeVraag, List<String> antwoorden) {

    }
    @Override
    public Vraag getVraag(String vraagnummer) {
        return null;
    }

    public boolean controleerAntwoord(List<String> antwoord) {
        return false;
    }

    private List<String> getCorrecteAntwoorden(int vraagNummer) {
        return null;
    }
}
