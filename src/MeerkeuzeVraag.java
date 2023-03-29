public class MeerkeuzeVraag extends Vraag {
    private String vraag;
    private String[] antwoorden;
    private int juisteAntwoord;


    @Override
    public Vraag getVraag(String vraagnummer) {
        return null;
    }

    @Override
    public boolean controleerAntwoord(String antwoord) {
        return false;
    }
}
