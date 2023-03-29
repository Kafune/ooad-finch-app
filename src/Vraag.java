public abstract class Vraag {
    private int vraagNummer;
    private String vraag;

    public abstract Vraag getVraag(String vraagnummer);
    public abstract boolean controleerAntwoord(String antwoord);
}
