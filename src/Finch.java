import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Finch {

    private Account account;
    private Vragenlijst vl;

    Finch(){
        Date date;
        Calendar c = Calendar.getInstance();
                c.add(Calendar.YEAR, 1);
        date = c.getTime();
        System.out.println(date);
        account = new Account("Steven", "password", "steven@test.nl");
        account.setSaldo(100);
        vl = new Vragenlijst();
        account.voegVragenlijstToe(vl.getVragen(), date);
    }
    public void startQuiz(String gebruikersnaam) {
        account = account.getAccount(gebruikersnaam);
//        vl = account.getVragenlijsten();
//        return vl;
    }
    public Account getAccount() {
        return account;
    }

//    private List<Vragenlijst> getVragenlijsten() {
//        return null;
//    }
}
