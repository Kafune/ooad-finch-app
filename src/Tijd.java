public class Tijd {
    private int minuten;
    private int seconden;

    public int getMinuten() {
        return minuten;
    }

    public String stopDoorloopTijd(){
        return minuten + ":" + seconden;
    }

}
