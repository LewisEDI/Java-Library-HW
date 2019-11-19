import java.util.ArrayList;

public class Gorilla {

    private String name;
    private ArrayList<Banana> belly;

    public Gorilla(String name){
        this.name = name;
        this.belly = new ArrayList<Banana>();
    }

    public int foodCount() {
        return this.belly.size();

    }

    public void eatBananaFromJungle(Jungle jungle) {
        Banana banana = jungle.removeBanana();
        this.belly.add(banana);
    }

    public void sleep() {
        this.belly.clear();
    }
}
