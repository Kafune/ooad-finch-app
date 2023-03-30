import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Finch {

    private Account acc;
    private Vragenlijst vl;

    private MockData mockData;

    Finch(){
        Date date;
        Calendar c = Calendar.getInstance();
                c.add(Calendar.YEAR, 1);
        date = c.getTime();
//        account.voegVragenlijstToe(vl.getVragen(), date);
    }
    public void startQuiz(String gebruikersnaam, String naamVragenlijst) {
        vl = vl.getVragenlijst(naamVragenlijst);
        acc = getAccount(gebruikersnaam);
//        return vl;
    }

    public Account getAccount(String gebruikersnaam) {

    }

    public Vragenlijst getVragenlijst(String naamVragenlijst) {

    }
}
