import java.util.Scanner;

public class InputInformation {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int integerNumber = scan.nextInt();
    double floatingNumber = scan.nextDouble();
    String text = scan.next();
    scan.close();

    System.out.println(integerNumber);
    System.out.println(floatingNumber);
    System.out.println(text);
  }
}