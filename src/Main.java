import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Finch finch = new Finch();
        finch.startQuiz("Steven");

        Scanner scanner = new Scanner(System.in);
        MockVragenlijst mockVragenlijst = new MockVragenlijst();
        var vragenlijsten = mockVragenlijst.getNieuweVragenlijst();

            System.out.println("Selecteer Vragenlijst:");
            for (int i = 0; i < vragenlijsten.size(); i++) {
                System.out.println(vragenlijsten.get(i).getVraag());
                String antwoord = scanner.nextLine();
            }


    }
}