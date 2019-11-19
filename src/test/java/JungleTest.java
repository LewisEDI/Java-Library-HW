import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JungleTest {

   private Jungle jungle;
   private Banana banana;

   @Before
    public void before() {
       jungle = new Jungle();
       banana = new Banana();

    }

    @Test
    public void noBananas(){
       assertEquals(0, jungle.bananaCount());
    }

    @Test
    public void canAddBanana(){
       jungle.addBanana(banana);
       assertEquals(1, jungle.bananaCount());
    }

    @Test
    public void canRemoveBanana(){
       jungle.addBanana(banana);
       Banana removedBanana = jungle.removeBanana();
       assertEquals(0, jungle.bananaCount());
       assertEquals(banana, removedBanana);
    }
}
