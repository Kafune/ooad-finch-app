import java.util.List;

public class Quiz {
    private int aantalCorrecteAntwoorden;
    private Vragenlijst vragen;

    Tijd tijd;

    public Quiz(Vragenlijst vragen) {
        tijd = new Tijd();
    }

    public Tijd getTijd() {
        return tijd;
    }
    public void setVragen(Vragenlijst vragen) {
        this.vragen = vragen;
    }
}
