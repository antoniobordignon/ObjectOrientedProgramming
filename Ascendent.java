import java.util.Scanner;

public class Ascendent {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int ceiling = scan.nextInt();
        int control = 1;

        while (control <= ceiling) {
            System.out.print(control+ " ");
            control++;
        }
        scan.close();
    }
}