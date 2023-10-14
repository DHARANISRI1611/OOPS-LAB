import java.util.Scanner;
public class WordsStartingWithLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        System.out.print("Enter the letter to filter by: ");
        char targetLetter = scanner.next().charAt(0);

        printWordsStartingWithLetter(inputSentence, targetLetter);
        scanner.close();
    }
    public static void printWordsStartingWithLetter(String sentence, char letter) {
        String[] words = sentence.split(" ");

        System.out.println("Words starting with the letter '" + letter + "':");

        for (String word : words) {
            if (!word.isEmpty() && word.charAt(0) == Character.toLowerCase(letter)) {
                System.out.println(word);
            }
        }
    }
}