import java.util.Scanner;
public class FirstCharPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();
        printFirstChar(inputSentence);
        scanner.close();
    }
    public static void printFirstChar(String sentence) {
        String[] words = sentence.split(" ");

        System.out.println("First characters of each word:");

        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(word.charAt(0) + " ");
            }
        }
    }
}