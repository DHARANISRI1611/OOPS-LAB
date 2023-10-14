import java.util.Scanner;
public class LowerCaseCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int lowercaseCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            if (Character.isLowerCase(character)) {
                lowercaseCount++;
            }
        }

        System.out.println("Number of lowercase characters: " + lowercaseCount);

        scanner.close();
    }
}