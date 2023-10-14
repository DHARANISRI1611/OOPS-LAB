
package JavaApplication60;
public class CharacterEncoding {
    public static void main(String[] args) {
        String input = "Hello World";

        String encodedString = encode(input);

        System.out.println("Encoded String: " + encodedString);

        String decodedString = decode(encodedString);

        System.out.println("Decoded String: " + decodedString);
    }

    public static String encode(String input) {
        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                char newChar = (char) (c + 2);
                encoded.append(newChar);
            } else {
                encoded.append(c);
            }
        }

        return encoded.toString();
    }

    public static String decode(String input) {
        StringBuilder decoded = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                char newChar = (char) (c - 2);
                decoded.append(newChar);
            } else {
                decoded.append(c);
            }
        }

        return decoded.toString();
    }
}