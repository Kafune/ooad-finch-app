import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockVragenlijst {
    private List<Vraag> vragen = new ArrayList<>();

    private Vraag vraag1 = new OpenVraag("Welke reggae zanger stierf op 11 mei 1981?", new ArrayList<>() {{
        add("bob marley");
    }});

    private Vraag vraag2 = new MeerkeuzeVraag("Met welk liedje brak Justin Bieber door bij het grote publiek?", new ArrayList<>() {{
        add("A. Stay");
        add("B. Baby");
        add("C. What Do You Mean?");
        add("D. One Time");
    }}, "B");

    private Vraag vraag3 = new OpenVraag("Welke band stond in 2020 in de hitparade met het nummer Soldier On?", new ArrayList<>() {{
        add("direct");
        add("di-rect");
    }});

//    private Vraag vraag4 = new OpenVraag();
//    private Vraag vraag5 = new OpenVraag();
    private Vraag vraag6 = new MeerkeuzeVraag("Welke band staat het vaakst in de Top 2000 van 2022?", new ArrayList<>() {{
        add("A. The Beatles");
        add("B. Coldplay");
        add("C. Queen");
        add("D. ABBA");
    }}, "C");
    private Vraag vraag7 = new MeerkeuzeVraag("Wie maakte de opera Aida?", new ArrayList<>() {{
        add("A. Mozart");
        add("B. Bach");
        add("C. Rossini");
        add("D. Verdi");
    }},"D");
//    private Vraag vraag8 = new OpenVraag();
//    private Vraag vraag9 = new OpenVraag();
    private Vraag vraag10 = new MeerkeuzeVraag("Wat is de eerste opening thema die in de japanse televisieserie One Piece wordt afgespeeld?", new ArrayList<>() {{
        add("A. Wake Up!");
        add("B. Brand New World");
        add("C. One Day");
        add("D. We Are!");
    }},"D");

    private List<Vraag> voegVragenToe() {
        vragen.add(vraag1);
        vragen.add(vraag2);
        vragen.add(vraag3);
//        vragen.add(vraag4);
//        vragen.add(vraag5);
        vragen.add(vraag6);
        vragen.add(vraag7);
//        vragen.add(vraag8);
//        vragen.add(vraag9);
        vragen.add(vraag10);
        return vragen;
    }
}
