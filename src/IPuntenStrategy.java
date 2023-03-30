public interface IPuntenStrategy {

    int berekenBonus(int aantalCorrect, boolean alleVragenGoed, Tijd tijd);
    int berekenTotaal(int bonuspunten);
}
