import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //mockdata
        Finch finch = new Finch();
        Scanner scanner = new Scanner(System.in);

        Quiz quiz = finch.startQuiz("Kachung", "Muziek");

//        Vragenlijst vragenlijst = quiz.getVragenlijst();
        List<Vraag> vragen = quiz.getVragenlijst().getVragen();

        System.out.println("Selecteer Vragenlijst:");

        for (int i = 0; i < vragen.size(); i++) {
            System.out.println("[Vraag " + (i + 1) + "] - " + vragen.get(i).getVraag());
            if (vragen.get(i) instanceof MeerkeuzeVraag) {;
                MeerkeuzeVraag meerkeuzeVraag = (MeerkeuzeVraag) vragen.get(i);
                for (String antwoord: ((MeerkeuzeVraag) vragen.get(i)).getAntwoorden()) {
                    System.out.println(" • " + antwoord);
                }
            }
            quiz.beantwoordVraag(i, scanner.nextLine());
        }

        quiz.rondQuizAf();

        if(quiz.controleerAlleVragenGoed()){
            System.out.println("Alle vragen zijn goed beantwoord!");
            System.out.println("Er zijn 2 munten bijgeschreven op je account!");
        };


    }
}