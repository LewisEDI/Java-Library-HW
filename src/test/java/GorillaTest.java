import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GorillaTest {

    private Gorilla gorilla;
    private Banana banana;
    private Jungle jungle;

    @Before
    public void before() {
        gorilla = new Gorilla("Koko");
        banana = new Banana();
        jungle = new Jungle();
        jungle.addBanana(banana);
    }

    @Test
    public void bellyStartsEmpty() {
        assertEquals(0, gorilla.foodCount());
    }

    @Test
    public void canEatBanana() {
        gorilla.eatBananaFromJungle(jungle);
        assertEquals(1, gorilla.foodCount());
    }

    @Test
    public void shouldEmptyBellyAfterSleeping(){
        gorilla.eatBananaFromJungle(jungle);
        gorilla.sleep();
        assertEquals(0, gorilla.foodCount());
    }
}
