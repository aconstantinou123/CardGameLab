public class Runner {

  public static void main(String[] args) {
      Bear bear = new Bear("Balu", 12, 60.54);
      bear.setName("Baloo");
      bear.setAge(15);
      String bearName = bear.getName();
      int bearAge = bear.getAge();
      double bearWeight = bear.getWeight();
      boolean hibernate = bear.readyToHibernate();

      System.out.println(bearName);
      System.out.println(bearAge);
      System.out.println(bearWeight);
      System.out.println(hibernate);
  }
}
