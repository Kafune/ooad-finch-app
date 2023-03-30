import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private String gebruikersnaam;
    private String wachtwoord;

    private String emailadres;
    private int saldo;

    private MockAccount mockAccount = new MockAccount();

    private List<Vraag> vragenlijsten = new ArrayList<>();

    public List<Vraag> getVragenlijsten() {
        return vragenlijsten;
    }

    public void voegVragenlijstToe(List<Vraag> vragenlijst, Date datumVandaag) {
        this.vragenlijsten = vragenlijst;
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
                System.out.println(account);
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
