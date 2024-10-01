package maps;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
  public static void main(String[] args) {
    putDemo();
    //countDemo();
  }

  public static void putDemo() {
    Map<String, String> schools = new HashMap<>();
    schools.put("Auberon", "Green River College");
    schools.put("Xinting", "University of Washington");
    schools.put("Damien", "The Ohio State University");
    schools.put("Tina", "Green River College");

    // 1. What does this print?
    System.out.println(schools.get("Xinting"));

    // 2. What does this print?
    schools.put("Xinting", "WSU");
    System.out.println(schools.get("Xinting"));
  }

  public static void countDemo() {
    String[] words = {"and", "yes", "I", "said", "yes", "I", "will", "yes"};
    Map<String, Integer> wordCount = new HashMap<>();

    for (String word : words) {
      if (!wordCount.containsKey(word)) {
        wordCount.put(word, 1);
      }
      else {
        int currentCount = wordCount.get(word);
        int newCount = currentCount + 1;
        wordCount.put(word, newCount);
      }
    }

    // What does this print?
    System.out.println(wordCount.get("yes"));
  }
}