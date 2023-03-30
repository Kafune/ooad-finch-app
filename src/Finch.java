import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Finch {

    private Account acc = new Account("Kachung", "test123", "test@test.com");
    Vragenlijst vl;
    private MockData mockData = new MockData();

    public Quiz startQuiz(String gebruikersnaam, String naamVragenlijst) {
        vl = mockData.getMockVragenlijst();
        vl.setOnderwerp(naamVragenlijst);
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
