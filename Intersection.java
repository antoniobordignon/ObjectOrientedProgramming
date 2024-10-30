import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Intersection {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();

    if (N > 1) {

      Set<Integer> setX = new HashSet<>();
      Set<Integer> setY = new HashSet<>();

      for (int i = 0; i < N; i++) {
        setX.add(scanner.nextInt());
      }

      for (int i = 0; i < N; i++) {
        setY.add(scanner.nextInt());
      }

      setX.retainAll(setY);

      for (int num : setX) {
        System.out.println(num);
      }

    } else {
      scanner.close();
      return;
    }
    
    scanner.close();
  }
}
