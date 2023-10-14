package JavaApplication60;
import java.util.Scanner;
public class PatternOccurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the pattern to search for: ");
        String pattern = scanner.nextLine();

        int occurrences = countOccurrences(input, pattern);

        System.out.println("Number of occurrences: " + occurrences);
    }

    public static int countOccurrences(String input, String pattern) {
        int count = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = input.indexOf(pattern, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += pattern.length();
            }
        }

        return count;
    }
}