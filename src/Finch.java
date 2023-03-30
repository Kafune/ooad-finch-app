import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Finch {

    private Account acc = new Account("Kachung", "test123", "test@test.com");

    private MockData mockData = new MockData();

    Finch(){
        Date date;
        Calendar c = Calendar.getInstance();
                c.add(Calendar.YEAR, 1);
        date = c.getTime();
//        acc.voegVragenlijstToe(vl.getVragen(), date);
    }
    public Quiz startQuiz(String gebruikersnaam, String naamVragenlijst) {
        Vragenlijst vl = mockData.getMockVragenlijst();
        acc = getAccount(gebruikersnaam);
        return acc.startQuiz(vl);
    }

    public Account getAccount(String gebruikersnaam) {
        if(acc.getGebruikersnaam().equals(gebruikersnaam)) {
            return acc;
        }
        return null;
    }
}
