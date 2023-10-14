import java.util.Scanner;
public class DigitCharacterSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String digits = "";
        String characters = "";

        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            if (Character.isDigit(character)) {
                digits += character;
            } else {
                characters += character;
            }
        }

        String resultString = digits + characters;
        System.out.println("New string with digits first: " + resultString);

        scanner.close();
    }
}