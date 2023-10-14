import java.util.Scanner;
public class UpperCasePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println("Uppercase characters in the string:");
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            if (Character.isUpperCase(character)) {
                System.out.print(character + " ");
            }
        }

        scanner.close();
    }
}