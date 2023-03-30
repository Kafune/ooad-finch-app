public class Puntensysteem {
    private IPuntenStrategy iPuntenStrategy;

    public int berekenBonus(int aantalCorrect, boolean alleVragenGoed, Tijd tijd) {
        return iPuntenStrategy.berekenBonus(aantalCorrect, alleVragenGoed, tijd);
    }

    public int berekenTotaal(int bonuspunten) {
        return iPuntenStrategy.berekenTotaal(bonuspunten);
    }

    public void setPuntenStrategy(IPuntenStrategy iPuntenStrategy) {
        this.iPuntenStrategy = iPuntenStrategy;
    }
}
