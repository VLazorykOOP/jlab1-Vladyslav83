import java.util.Scanner;

public class FindWordsWithUniqueLetters {
    public FindWordsWithUniqueLetters() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст: ");
        String text = scanner.nextLine();

        String regex = "[\\s\\p{Punct}]+";
        String[] words = text.split(regex);

        for (String word : words) {
            if (hasUniqueLetters(word)) {
                System.out.println(word);
            }
        }

        scanner.close();
    }

    public static boolean hasUniqueLetters(String word) {
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); ++i) {
            char currentChar = word.charAt(i);
            if (Character.isLetter(currentChar) && word.indexOf(currentChar, i + 1) != -1) {
                return false;
            }
        }

        return true;
    }
}
