import java.util.ArrayList;
import java.util.List;

public class Account {
    private String gebruikersnaam;
    private String wachtwoord;

    private String emailadres;
    private int saldo;

    private MockAccount mockAccount = new MockAccount();

    public List<MockVragenlijst> getVragenlijsten() {
        return vragenlijsten;
    }

    private List<MockVragenlijst> vragenlijsten = new ArrayList<>();

    public void voegVragenlijstToe(List<MockVragenlijst> vragenlijsten) {
        this.vragenlijsten = vragenlijsten;
    }

    public Account(String gebruikersnaam, String wachtwoord, String emailadres) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.emailadres = emailadres;
    }

    public Account getAccount(String gebruikersnaam) {

        List<Account> accounts = mockAccount.getAccounts();
        for (Account account : accounts) {
            if (gebruikersnaam.equals(this.gebruikersnaam)) {
                return account;
            }
        }
        return null;
    }

//    public void startQuiz(Vragenlijst vragenlijst) {
////        Quiz quiz = new Quiz(vragenlijst);
//    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
