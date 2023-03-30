public class Tijd {
    private int minuten;
    private int seconden;

    Tijd() {
        startDoorloopTijd();
    }
    public void startDoorloopTijd() {

    }

    public int getMinuten() {
        return minuten;
    }

    public String stopDoorloopTijd(){
        return minuten + ":" + seconden;
    }

}
