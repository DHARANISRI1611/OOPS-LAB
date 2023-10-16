
package javaapplication71;
import java.util.Scanner;
public class JavaApplication71 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter an email address: ");
            String email = scanner.nextLine();
            if (isValidEmail(email)) {
                System.out.println("Email address is valid.");
            } else {
                System.out.println("Email address is invalid.");
            }
        }
    }
    public static boolean isValidEmail(String email) {
        int atCount = 0;
        int atPosition = -1;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                atCount++;
                atPosition = i;
            }
        }
        if (atCount != 1 || atPosition == 0 || atPosition == email.length() - 1) {
            return false;
        }
        String localPart = email.substring(0, atPosition);
        String domain = email.substring(atPosition + 1);
        if (localPart.length() < 1 || domain.length() < 1) {
            return false;
        }
        if (!domain.contains(".")) {
            return false;
        }

        String validCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_.@";
        for (char c : domain.toCharArray()) {
            if (validCharacters.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
  