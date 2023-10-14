import java.util.Scanner;
public class ReverseCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String reversedString = reverseCase(inputString);
        System.out.println("String with reversed case: " + reversedString);
        scanner.close();
    }
    public static String reverseCase(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char character = charArray[i];
            if (Character.isUpperCase(character)) {
                charArray[i] = Character.toLowerCase(character);
            } else if (Character.isLowerCase(character)) {
                charArray[i] = Character.toUpperCase(character);
            }
        }

        return new String(charArray);
    }
}
