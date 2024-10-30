import java.util.Scanner;

public class Avarege {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value1 = scanner.nextDouble();
        double value2 = scanner.nextDouble();
        double value3 = scanner.nextDouble();
        double value4 = scanner.nextDouble();
        
        double avarege = (value1 + value2 + value3 + value4) / 4;

        System.out.printf("%.1f%n", avarege);

        scanner.close();
    }
}