import java.util.List;

public class Vragenlijst {
    int vragenlijstNummer;
    List<Vraag> vragen;
    String onderwerp;

    Vragenlijst(int vragenlijstNummer, String onderwerp, List<Vraag> vragen) {
        this.vragenlijstNummer = vragenlijstNummer;
        this.onderwerp = onderwerp;
        this.vragen = vragen;
    }

    public Vragenlijst getVragenlijst(String naamVragenlijst) {
        if(this.onderwerp.equals(naamVragenlijst)) {
            return this;
        }
        return null;
    }
    public List<Vraag> getVragen() {
        return vragen;
    }

    public void setVragenlijst(List<Vraag> vragen) {
        this.vragen = vragen;
    }


}
