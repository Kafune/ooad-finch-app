import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Finch finch = new Finch();
        var vragenlijsten = finch.startKennisquiz("Steven");
        Account account = finch.getAccount();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecteer Vragenlijst:");
        String antwoord = scanner.nextLine();

    }
}