package arrays;

public class ArrayDemo {
  public static void main(String[] args) {
    indexingDemo();
    // multidimensionalDemo();
  }

  public static void indexingDemo() {
    String[] words = {"from", "swerve", "of", "shore"};

    // 1. What does this print?
    System.out.println(words.length);

    // 2. What does this print?
    System.out.println(words[1]);
  }

  public static void multidimensionalDemo() {
    char[][] letters = {
      {'a', 'b', 'c', 'd'},
      {'e', 'f', 'g', 'h'},
      {'i', 'j', 'k', 'l'},
      {'m', 'n', 'o', 'p'},
      {'q', 'r', 's', 't'}
    };

    // 1. What does this print?
    System.out.println(letters[3][2]);

    // 2. What does this print?
    char[] subArray = letters[2];
    subArray[0] = 'z';
    System.out.println(letters[2][0]);
  }
}
