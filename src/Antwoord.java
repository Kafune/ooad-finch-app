public class Antwoord {
    private String antwoord;

    private Vraag huidigeVraag;

    public Antwoord(Vraag huidigeVraag, String antwoord) {
        this.huidigeVraag = huidigeVraag;
        this.antwoord = antwoord;
    }
    public String getAntwoord() {
        return antwoord;
    }


//    public Vraag controleerAntwoord() {
//        if (huidigeVraag.getAntwoord().equals(antwoord)) {
//            return huidigeVraag;
//        }
//        return null;
//    }

}
