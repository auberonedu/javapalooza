package instances;

public class InstancesDemo {
  public static void main(String[] args) {
    constructorDemo();
    //mutateDemo();
  }

  public static void constructorDemo() {
    Book book1 = new Book("Java Programming", 45, 10);
    Book book2 = new Book("Effective Java", 60, 20);

    // What do these print?
    System.out.println(book1);
    System.out.println(book2);
  }


  public static void mutateDemo() {
    Book book1 = new Book("Freshwater", 30, 5);
    Book book2 = new Book("Are You My Mother?", 20, 7);

    book1.setCondition("Used");

    // What do these print?
    System.out.println(book1.getCondition());
    System.out.println(book2.getCondition());
  }

}
