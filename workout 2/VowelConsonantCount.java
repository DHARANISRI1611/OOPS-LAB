
package JavaApplication60;
import java.util.Scanner;
public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = countVowels(input);
        int consonantCount = countConsonants(input);

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static int countVowels(String input) {
        int count = 0;
        String lowerCaseInput = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c = lowerCaseInput.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String input) {
        int count = 0;
        String lowerCaseInput = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c = lowerCaseInput.charAt(i);
            if (c >= 'a' && c <= 'z' && !isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
 