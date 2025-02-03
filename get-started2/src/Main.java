public class Main {

  public static void main(String[] args) {
    printEmployee(new Manager());
    printEmployee(new Salesman());

  }

  public static void printEmployee(Employee employee) {

    System.out.println("============");
    switch (employee) {
      case Manager manager -> {
        manager.setCode("123");
        manager.setName("John");
        manager.setSalary(5000.0);
        manager.setLogin("John123");
        manager.setPassword("123456");
        manager.setCommission(0.15);

        System.out.println(manager.getCode());
        System.out.println(manager.getName());
        System.out.println(manager.getSalary());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());
        System.out.println(manager.getCommission());
      }
      case Salesman salesman -> {
        salesman.setCode("456");
        salesman.setName("Mary");
        salesman.setSalary(2500.0);
        salesman.setPercentPerSold(0.05);

        System.out.println(salesman.getCode());
        System.out.println(salesman.getName());
        System.out.println(salesman.getSalary());
        System.out.println(salesman.getPercentPerSold());

      }
    }
    System.out.println("============");
  }
}
