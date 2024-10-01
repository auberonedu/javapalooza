package compoundStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompoundStructures {
  public static void main(String[] args) {
    mapAndListDemo();
  }

  public static void mapAndListDemo() {
    List<String> poutine = new ArrayList<>();
    poutine.add("Fries");
    poutine.add("Cheese Curds");
    poutine.add("Gravy");

    List<String> pho = new ArrayList<>();
    pho.add("Rice Noodles");
    pho.add("Beef");
    pho.add("Broth");
    pho.add("Herbs");

    List<String> paella = new ArrayList<>();
    paella.add("Rice");
    paella.add("Saffron");
    paella.add("Chicken");
    paella.add("Shrimp");

    Map<String, List<String>> cookbook = new HashMap<>();
    cookbook.put("Poutine", poutine);
    cookbook.put("Pho", pho);
    cookbook.put("Paella", paella);

    // What does this print?
    List<String> ingredients = cookbook.get("Pho");
    System.out.println(ingredients.get(2));
  }
}
