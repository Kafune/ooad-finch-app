import java.util.List;

public class Vragenlijst {
    int vragenlijstNummer;
    List<Vraag> vragen;

    Vragenlijst() {
        MockVragenlijst mockVragenlijst = new MockVragenlijst();
        vragen = mockVragenlijst.getNieuweVragenlijst();
        vragenlijstNummer = 1;
    }

    public int getVragenlijstNummer() {
        return vragenlijstNummer;
    }
    public List<Vraag> getVragen() {
        return vragen;
    }

//    private String onderwerp;
//
//    private double prijs;
//
//    private Finch finch;
//
//    private Thema thema;
//
//    private Vraag[] vraag;
//
//    private VragenlijstDetails[] vragenlijstDetails;
//
//    public double getPrijs() {
//        return 0;
//    }
//
//    public Vragenlijst getVragenlijst(String naamVragenlijst) {
//        return null;
//    }

}
