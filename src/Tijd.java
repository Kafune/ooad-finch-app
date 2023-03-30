import java.util.Timer;
import java.util.TimerTask;

public class Tijd {
    private int minuten = 0;
    private int seconden = 0;

    Tijd() {
        startDoorloopTijd();
    }
    public void startDoorloopTijd() {
        int delay = 5000; // delay for 5 sec.
        int period = 1000; // repeat every sec.
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask()
        {
            public void run()
            {
                seconden++;
                if(seconden >= 60) {
                    minuten++;
                    seconden = 0;
                }
            }
        }, delay, period);
    }

    public int getMinuten() {
        return minuten;
    }

    public int getSeconden() { return seconden; }

    public String stopDoorloopTijd(){
        return "Je deed er " + minuten + " minuten en " + seconden + " seconden erover gedaan!";
    }

}
