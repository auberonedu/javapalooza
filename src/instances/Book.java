package instances;

public class Book {
  private String title;
  private int price;
  private String condition;

  public Book(String title, int originalPrice, int discount) {
      this.title = title;
      this.price = originalPrice - discount;
      this.condition = "New";
  }

  public double getPrice() {
      return price;
  }

  public String getCondition() {
    return condition;
  }

  public void setCondition(String newCondition) {
    condition = newCondition;
  }

  @Override
  public String toString() {
      return title + " - Price: $" + price + " Condition: " + condition;
  }

}

