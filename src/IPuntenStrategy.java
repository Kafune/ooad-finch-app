public interface IPuntenStrategy {

    int berekenBonus(int aantalCorrect, Account account, Tijd tijd);
    int berekenTotaal(int bonuspunten);
}
