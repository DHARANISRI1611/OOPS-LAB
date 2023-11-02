
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConvertToLowercase {
    public static void main(String[] args) {
        try {
            // Open the input file
            File inputFile = new File("input.txt");
            PrintWriter writer;
            // Create the output file
            try (Scanner scanner = new Scanner(inputFile)) {
                // Create the output file
                File outputFile = new File("output.txt");
                writer = new PrintWriter(outputFile);
                // Read each line from the input file
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    
                    // Convert the line to lowercase
                    String lowercaseLine = line.toLowerCase();
                    
                    // Write the lowercase line to the output file
                    writer.println(lowercaseLine);
                }
                // Close the input and output files
            }
            writer.close();

            System.out.println("Conversion completed successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
