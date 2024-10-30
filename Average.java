import java.util.Scanner;

public class Average {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();

    if (N > 1) {
      int[] value = new int[N];
      int sum = 0;

      for (int i = 0; i < N; i++) {
        value[i] = scanner.nextInt();
        sum += value[i];
      }

      double average = (double) sum / N;

      System.out.printf("%.2f\n", average);

      for (int i = 0; i < N; i++) {
        if (value[i] > average) {
          System.out.println(value[i]);
        }
      }
    } else {
      scanner.close();
      return;
    }

    scanner.close();
  }
}