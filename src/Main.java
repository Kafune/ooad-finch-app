import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Finch finch = new Finch();
        finch.startQuiz("Steven");

        Scanner scanner = new Scanner(System.in);
        MockVragenlijst mockVragenlijst = new MockVragenlijst();
//        Quiz huidigeQuiz = finch.getKennisquiz();
        List<Vraag> vragenlijst = mockVragenlijst.getNieuweVragenlijst();
        Quiz huidigeKennisquiz = new Quiz(vragenlijst);

        System.out.println("Selecteer Vragenlijst:");
        for (int i = 0; i < vragenlijst.size(); i++) {
            System.out.println("[Vraag " + (i + 1) + "] - " + vragenlijst.get(i).getVraag());
            if (vragenlijst.get(i) instanceof MeerkeuzeVraag) {;
                MeerkeuzeVraag meerkeuzeVraag = (MeerkeuzeVraag) vragenlijst.get(i);
                for (String antwoord: ((MeerkeuzeVraag) vragenlijst.get(i)).getAntwoorden()) {
                    System.out.println(" • " + antwoord);
                }
            }
            huidigeKennisquiz.beantwoordVraag(i, scanner.nextLine());
        }
        if(huidigeKennisquiz.controleerAlleVragenGoed()){
            System.out.println("Alle vragen zijn goed beantwoord!");
            System.out.println("Er zijn 2 munten bijgeschreven op je account!");
        };

    }
}