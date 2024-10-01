package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    addDemo();
    //sortDemo();
  }

  public static void addDemo() {
    List<Integer> numList = new ArrayList<>();
    numList.add(7);
    numList.add(6);
    numList.add(8);
    numList.add(1);

    // 1. What does this print?
    System.out.println(numList.get(2));

    // 2. What does this print?
    numList.add(1, 44);
    System.out.println(numList.get(2));
  }

  public static void sortDemo() {
    List<Integer> numList = new ArrayList<>();
    numList.add(22);
    numList.add(88);
    numList.add(44);
    numList.add(99);

    Collections.sort(numList);

    // What does this print?
    System.out.println(numList.get(1));
  }
}
