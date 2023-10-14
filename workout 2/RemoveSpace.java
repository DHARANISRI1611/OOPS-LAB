import java.util.Scanner;
public class RemoveSpace
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String inputString = scanner.nextLine();

        // Remove spaces using the replaceAll method
        String stringWithoutSpaces = inputString.replaceAll("\\s", "");

        System.out.println("String after removing spaces: " + stringWithoutSpaces);

        scanner.close();
    }
}