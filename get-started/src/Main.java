public class Main {

  public static void main(String[] args) {

    var male = new Person("John");
    male.setAge(25);

    var female = new Person("Jane");
    female.setAge(22);

    System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
    System.out.println("Female name: " + female.getName() + " age: " + female.getAge());
  }

}
