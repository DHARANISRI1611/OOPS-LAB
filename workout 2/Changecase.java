
package changecase;
import java.util.*;
public class Changecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String word = sc.next();
        String lowercaseWord = word.toLowerCase();
        System.out.println("Lowercase: " + lowercaseWord);
        String uppercaseWord = word.toUpperCase();
        System.out.println("Uppercase: " + uppercaseWord);
    }
}