import java.util.ArrayList;

public class Jungle {

    private ArrayList<Banana> bananas;

    public Jungle() {
        this.bananas = new ArrayList<Banana>();
    }

    public int bananaCount() {
        return this.bananas.size();
    }

    public void addBanana(Banana banana) {
        this.bananas.add(banana);

    }

    public Banana removeBanana() {
       return this.bananas.remove(0);
    }

}
