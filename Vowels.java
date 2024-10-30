import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Vowels {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    Map<Character, Integer> counterVowels = new LinkedHashMap<>();
    counterVowels.put('a', 0);
    counterVowels.put('e', 0);
    counterVowels.put('i', 1);
    counterVowels.put('o', 0);
    counterVowels.put('u', 0);
  
    while (true) {
      String line = scanner.nextLine();

      if (line.equals("FIM")) {
        break;
      }

      for (char c : line.toLowerCase().toCharArray()) {
        if (counterVowels.containsKey(c)) {
          counterVowels.put(c, counterVowels.get(c) + 1);
        }
      }
    }

    scanner.close();
    
    for (Map.Entry<Character, Integer> entry : counterVowels.entrySet()) {
      System.out.println(entry.getKey() + "=" + entry.getValue());
    }
  }
}