 import org.junit.Before;
 import org.junit.Test;
 import static  org.junit.Assert.assertEquals;

 public class BearTest {

     Bear myBear;

     @Before
     public void before() {
         myBear = new Bear("Balu", 12, 60.54, 360.25);
     }

     @Test
     public void hasName() {
         assertEquals("Balu", myBear.getName());
     }

     @Test
     public void hasAge() {
         assertEquals(12, myBear.getAge());
     }

     @Test
     public void hasWeight() {
         assertEquals(60.54, myBear.getWeight(), 0.01);
     }

     @Test
     public void readyToHibernate() {
         assertEquals(false, myBear.readyToHibernate());
     }


     @Test
     public void readyToDrink() {
         assertEquals(false, myBear.tooYoungToDrink());
     }

     @Test
     public void hasHeight() {
        assertEquals(360.25, myBear.getHeight(), 0.001);
     }

     @Test
     public void hasBmi() {
         assertEquals(5.950611166171127, myBear.bearBmi(), 0.001);
     }

 }



