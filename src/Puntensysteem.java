public class Puntensysteem {
    private IPuntenStrategy iPuntenStrategy;

    public int berekenBonus(int aantalCorrect, Account account, Tijd tijd) {
        return iPuntenStrategy.berekenBonus(aantalCorrect, account, tijd);
    }

    public int berekenTotaal(int bonuspunten) {
        return iPuntenStrategy.berekenTotaal(bonuspunten);
    }

    public void setPuntenStrategy(IPuntenStrategy iPuntenStrategy) {
        this.iPuntenStrategy = iPuntenStrategy;
    }
}
