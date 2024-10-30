import java.util.Scanner;

public class NegativeValue {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int lenght = 0;

        int buffer = 0;
        
        while (buffer >= 0) {
            buffer = scan.nextInt();
            lenght++;
            if (buffer >= 0) {
                sum += buffer;
                continue;
            } 
            break;
        }

        System.out.println("Quantidade = " + lenght);
        System.out.println("Soma = " + sum);
    }
}