import java.util.Scanner;

public class Name {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String nome = scan.next();
    String sobrenome = scan.next();

    System.out.println(nome + " " + sobrenome);
  }
}
