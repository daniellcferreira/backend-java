public non-sealed class Salesman extends Employee {

  public Salesman(String code, String name, String address, int age, double salary) {
    super(code, name, address, age, salary);
  }

  @Override
  public String getCode() {
    return "SL" + super.getCode();
  }

  public Salesman() {
  }

  private double percentPerSold;

  public void setPercentPerSold(double percentPerSold) {
    this.percentPerSold = percentPerSold;
  }

  public double getPercentPerSold() {
    return percentPerSold;
  }

}
