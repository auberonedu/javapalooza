package loops;

public class LoopsDemo {
  public static void main(String[] args) {
    forDemo();
    // whileDemo();
  }

  public static void forDemo() {
    String[] words = {"We", "came", "from", "somewhere", "-", "everyone", "does"};

    // 1. What does this print?
    for(int i = words.length-1; i >= 0; i--) {
      System.out.println(words[i]);
    }

    System.out.println("----------------------");

    // 2. What does this print?
    // for(String word : words) {
    //   System.out.println(word);
    // }
  }

  public static void whileDemo() {
    int count = 1;
    while(count < 7) {
      count *= 2; 
    }

    // What does this print?
    System.out.println(count);
  }
}
