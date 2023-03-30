import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //mockdata
        Account acc = new Account("Kachung", "test123", "test@test.nl");
        acc.setSaldo(100);

        acc.getAccount("Kachung");

        Finch finch = new Finch();

        finch.startQuiz("Kachung", "Muziek");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecteer Vragenlijst:");
        String antwoord = scanner.nextLine();

    }
}