
package deleteword;
import java.util.Scanner;

public class Deleteword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the word to delete: ");
        String wordToDelete = scanner.next();
        String modifiedString = inputString.replace(wordToDelete, "");
        System.out.println("Modified string: " + modifiedString);      
    }
   
}

   
