
package JavaApplication60;
public class Alphabeticvalidation {
    public static void main(String[] args) {
        String input1 = "HelloWorld";   // Example input with only alphabetic characters
        String input2 = "Hello123";     // Example input with digits

        boolean isValid1 = validateAlphabetic(input1);
        boolean isValid2 = validateAlphabetic(input2);

        System.out.println("Input 1 is valid: " + isValid1);
        System.out.println("Input 2 is valid: " + isValid2);
    }

    public static boolean validateAlphabetic(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}