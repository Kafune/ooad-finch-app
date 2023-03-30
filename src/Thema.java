public class Thema {
    private String naam;

    public Thema getThema(String themaNaam) {
        Thema thema = new Thema();
        thema.setThema(themaNaam);
        return new Thema();
    }

    public void setThema(String themaNaam) {
        this.naam = themaNaam;
    }
}
