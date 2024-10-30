import java.util.Scanner;

public class HighestValue {
    public static void main(String args[]) {
        int highestValue = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            
            int temp = scan.nextInt();
            if (temp > highestValue) {
                highestValue = temp;
            }
        }
        System.out.println(highestValue);
    }
}