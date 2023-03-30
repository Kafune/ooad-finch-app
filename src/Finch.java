import java.util.List;

public class Finch {

    private Account account;
    private List<MockVragenlijst> vl;

    Finch(){
        account = new Account("Steven", "password", "steven@test.nl");
        account.setSaldo(100);
    }
    public List<MockVragenlijst> startKennisquiz(String gebruikersnaam){
        account = account.getAccount(gebruikersnaam);
        vl = account.getVragenlijsten();
        return vl;
    }
    public Account getAccount() {
        return account;
    }

//    private List<Vragenlijst> getVragenlijsten() {
//        return null;
//    }
}
