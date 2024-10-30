import java.util.Scanner;

public class Inteval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        while (true) {
            int buffer = scanner.nextInt();
            if (buffer < 0) {
                break;
            }
            if (buffer >= 0 && buffer <= 25) {
                a++;
            } else if (buffer >= 26 && buffer <= 50) {
                b++;
            } else if (buffer >= 51 && buffer <= 75) {
                c++;
            } else if (buffer >= 76 && buffer <= 100) {
                d++;
            }
        }

        System.out.println("[0,25] = " + a);
        System.out.println("[26,50] = " + b);
        System.out.println("[51,75] = " + c);
        System.out.println("[76,100] = " + d);

        scanner.close();
    }
}