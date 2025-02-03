public non-sealed class Manager extends Employee {

  public Manager(String code, String name, String address, int age, double salary) {
    super(code, name, address, age, salary);
  }

  @Override
  public String getCode() {
    return "MN" + super.getCode();
  }

  public Manager() {
  }

  private String login;
  private String password;
  private double commission;

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public double getCommission() {
    return commission;
  }

  public void setCommission(double commission) {
    this.commission = commission;
  }

}
