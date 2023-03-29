public class Account {


    private String gebruikersnaam;
    private String wachtwoord;
    private int saldo;

    public Account(String gebruikersnaam, String wachtwoord) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
    }

    public Account getAccount(String gebruikersnaam) {
        // TODO: implement
        return null;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
