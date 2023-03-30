import java.util.ArrayList;
import java.util.List;

public class MockAccount {
    private List<Account> accounts = new ArrayList<>();
    private List<MockVragenlijst> vragenlijsten = new ArrayList<>();

    public MockAccount() {
        generateAccounts();
    }
    private void generateAccounts() {

//        Account acc1 = new Account("Steven", "mockPassw0rd", "steven@test.nl");
//        Account acc2 = new Account("Kachung", "mockPassw0rd", "kachung@test.nl");
//
//        acc1.voegVragenlijstToe(vragenlijsten);
//        acc2.voegVragenlijstToe(vragenlijsten);
//
//        accounts.add(acc1);
//        accounts.add(acc2);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

}
