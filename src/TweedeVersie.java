public class TweedeVersie implements PuntenStrategy {
    @Override
    public int berekenBonus(int aantalCorrect, Account account, Tijd tijd) {
        return 0;
    }

    @Override
    public int berekenTotaal(int bonuspunten) {
        return 0;
    }
}
