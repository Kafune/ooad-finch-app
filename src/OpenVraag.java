public class OpenVraag extends Vraag {
    private String antwoord;
    private String vraag;

    @Override
    public Vraag getVraag(String vraagnummer) {
        return null;
    }

    public boolean controleerAntwoord(String antwoord) {
        return this.antwoord.equals(antwoord);
    }
}
