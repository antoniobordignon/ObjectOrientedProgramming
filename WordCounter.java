import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String searchWord = scanner.nextLine();

        int count = countOccurrences(text, searchWord);

        System.out.println(searchWord + "=" + count);

        scanner.close();
    }

    private static int countOccurrences(String text, String searchWord) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(searchWord, index)) != -1) {
            count++;
            index += searchWord.length();
        }

        return count;
    }
}