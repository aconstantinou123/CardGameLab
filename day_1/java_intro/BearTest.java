 import org.junit.Before;
 import org.junit.Test;
 import static  org.junit.Assert.assertEquals;

 public class BearTest {

   Bear myBear;

   @Before
   public void before() {
     Bear myBear = new Bear("Balu", 12, 90.54);
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
     assertEquals(90.54, myBear.getWeight(), 0.01);
   }

   @Test
   public void readyToHibernate() {
     assertEquals(true, myBear.readyToHibernate());
   }
 }
