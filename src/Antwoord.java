public class Antwoord {
    private String antwoord;

    private Vraag huidigeVraag;

    public Antwoord(String antwoord, Vraag huidigeVraag) {
        this.antwoord = antwoord;
        this.huidigeVraag = huidigeVraag;
    }

//    public Vraag controleerAntwoord() {
//        if (huidigeVraag.getAntwoord().equals(antwoord)) {
//            return huidigeVraag;
//        }
//        return null;
//    }

}
