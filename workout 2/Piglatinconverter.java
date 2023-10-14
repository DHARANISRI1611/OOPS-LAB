
package JavaApplication60;
import java.util.Scanner;
public class Piglatinconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        String pigLatin = convertToPigLatin(input);

        System.out.println("Pig Latin: " + pigLatin);
    }

    public static String convertToPigLatin(String input) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();

        String[] words = input.split(" ");
        for (String word : words) {
            if (vowels.indexOf(word.charAt(0)) != -1) {
                result.append(word).append("way ");
            } else {
                int index = 0;
                while (index < word.length() && vowels.indexOf(word.charAt(index)) == -1) {
                    index++;
                }
                String prefix = word.substring(0, index);
                String suffix = word.substring(index);
                result.append(suffix).append(prefix).append("ay ");
            }
        }

        return result.toString().trim();
    }
}