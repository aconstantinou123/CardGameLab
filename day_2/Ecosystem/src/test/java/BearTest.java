import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear myBear;
    Salmon simon;
    River thames;

    @Before
    public void before() {
        myBear = new Bear("Yogi");
        simon = new Salmon();
        thames = new River();
    }


    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, myBear.foodCount());
    }

    @Test
    public void catEatSalmon(){
        thames.addFish(simon);
        myBear.eat(thames);
        assertEquals(1, myBear.foodCount());
    }

    @Test
    public void canSleep(){
        thames.addFish(simon);
        myBear.eat(thames);
        myBear.sleep();
        assertEquals(0, myBear.foodCount());
    }

    @Test
    public void riverFishCount() {
        assertEquals(0, thames.fishCount());
    }

    @Test
    public void canAddFish() {
        thames.addFish(simon);
        assertEquals(1, thames.fishCount());
    }

    @Test
    public void canRemoveFish() {
        thames.addFish(simon);
        thames.removeFish();
        assertEquals(0, thames.fishCount());
    }

}
