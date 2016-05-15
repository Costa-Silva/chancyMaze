/**
 * Created by paulo on 15/05/2016.
 */
public class Corridor {

    private int from;
    private int to;
    private int coins;

    public Corridor(int from, int to,int coins){
        this.from=from;
        this.to=to;
        this.coins=coins;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public int getCoins() {
        return coins;
    }

}
