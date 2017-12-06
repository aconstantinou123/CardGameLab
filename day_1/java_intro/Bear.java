public class Bear {

  // private - name can only be changed through the getName method

  private String name;
  private int age;
  private double weight;

  // constructor - allows the creation of a bear object

  public Bear(String name, int age, double weight) {
      this.name = name;
      this.age = age;
      this.weight = weight;
  }

  // get name method

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getWeight() {
    return weight;
  }

  public boolean readyToHibernate() {
    return this.weight >= 80.00;
  }

  // set name method - void as not returning anything

  public void setName(String name) {
     this.name = name;
  }

  public void setAge(int age) {
      this.age = age;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}
