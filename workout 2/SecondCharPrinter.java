import java.util.Scanner;
public class SecondCharPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        if (sentence.length() >= 2) {
            String firstTwoChars = sentence.substring(0, 2);
            System.out.println("First two characters: " + firstTwoChars);
        } else {
            System.out.println("The sentence is too short to get the first two characters.");
        }
    }
}