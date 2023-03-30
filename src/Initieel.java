public class Initieel implements IPuntenStrategy {

    @Override
    public int berekenBonus(int aantalCorrect, boolean alleVragenGoed, Tijd tijd) {
        int bonuspoints = 0;
        bonuspoints += bonuspoints * aantalCorrect;
        int timepoints = bonuspoints - tijd.getMinuten();

        if(tijd.getMinuten() >= 5) {
            timepoints = 1;
        }

        if(alleVragenGoed) {
            bonuspoints += 5;
        }

        return bonuspoints + timepoints;
    }

    @Override
    public int berekenTotaal(int bonuspunten) {
        return bonuspunten + 10;
    }
}
