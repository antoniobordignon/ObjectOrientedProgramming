import java.util.Scanner;

public class ReversePhrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phrase = scanner.nextLine();

        String reversedPhrase = reversePhrase(phrase);

        System.out.println(reversedPhrase);
        System.out.println(phrase.length());

        scanner.close();
    }

    private static String reversePhrase(String phrase) {
        return new StringBuilder(phrase).reverse().toString();
    }
}