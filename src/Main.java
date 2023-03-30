import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //mockdata
        Finch finch = new Finch();

        Quiz quiz = finch.startQuiz("Kachung", "Muziek");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecteer Vragenlijst:");
        String antwoord = scanner.nextLine();

    }
}