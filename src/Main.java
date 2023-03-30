import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Finch finch = new Finch();
        finch.startQuiz("Steven");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecteer Vragenlijst:");
        String antwoord = scanner.nextLine();

    }
}