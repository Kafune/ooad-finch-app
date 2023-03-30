import java.util.Date;
import java.util.List;

public class Account {
    private String gebruikersnaam;
    private String wachtwoord;

    private String emailadres;
    private int saldo;
    private Quiz quiz;

    private List<VragenlijstDetails> vragenlijstDetailsList;

    public List<VragenlijstDetails> getVragenlijstDetails() {
        return getVragenlijstDetails();
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public Account(String gebruikersnaam, String wachtwoord, String emailadres) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.emailadres = emailadres;
    }
    public Account getAccount(String gebruikersnaam) {
        if(this.gebruikersnaam.equals(gebruikersnaam)) {
            return this;
        }
        return new Account(gebruikersnaam, "test123", "test@test.com");
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Quiz startQuiz(Vragenlijst vl) {
        Quiz quiz = new Quiz(vl);
        return quiz;
    }
}
