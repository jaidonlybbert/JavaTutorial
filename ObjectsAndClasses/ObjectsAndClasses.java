// Jaidon Lybbert
// June 27, 2019
// Tutorial from tutorialspoint.com

public class ObjectsAndClasses {
  String name;
  int age;

  ObjectsAndClasses(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }


  public static void main(String[] args) {
    ObjectsAndClasses puppy = new ObjectsAndClasses("Tom");
    puppy.setAge(13);
    System.out.println(puppy.name);
    System.out.println(puppy.getAge());
  }

}
