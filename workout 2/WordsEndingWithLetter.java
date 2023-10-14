import java.util.Scanner;
public class WordsEndingWithLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();
        System.out.print("Enter the letter to filter by: ");
        char targetLetter = scanner.next().charAt(0);
        printWordsEndingWithLetter(inputSentence, targetLetter);
        scanner.close();
    }
    public static void printWordsEndingWithLetter(String sentence, char letter) {
        String[] words = sentence.split(" ");
        System.out.println("Words ending with the letter '" + letter + "':");
        for (String word : words) {
            if (!word.isEmpty() && word.charAt(word.length() - 1) == Character.toLowerCase(letter)) {
                System.out.println(word);
            }
        }
    }
}