
package JavaApplication60;
public class Asciicode {
    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("ASCII codes:");
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int asciiCode = (int) c;
            System.out.println(c + ": " + asciiCode);
        }
    }
}