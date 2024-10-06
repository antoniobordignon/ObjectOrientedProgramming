import java.util.Scanner;

public class AdditionAndSubtraction {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int firstNumber = scan.nextInt();
    int secondNumber = scan.nextInt();

    System.out.println("soma = " + (firstNumber + secondNumber));
    System.out.println("subtracao = " + (firstNumber - secondNumber));
  }
}