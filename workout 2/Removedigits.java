
package JavaApplication60;

public class Removedigits {
    public static void main(String[] args) {
        String input = "Hello123World456";
        String result = removeDigits(input);
        System.out.println("Result: " + result);
    }
    public static String removeDigits(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isDigit(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
   