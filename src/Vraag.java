public abstract class Vraag {
    private int vraagNummer;
    private String vraag;

    public abstract String getVraag();

    public abstract boolean controleerAntwoord(String antwoord);
}
