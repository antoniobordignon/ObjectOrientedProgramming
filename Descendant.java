import java.util.Scanner;

public class Descendant {
     public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int ceiling = scan.nextInt();
      

        while ( ceiling > 0) {
            System.out.print(ceiling+ " ");
            ceiling--;
        }
        scan.close();
    }
}