
package javaapplication75;
import java.io.*;
public class JavaApplication75 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the file name: ");
            String fileName = reader.readLine();

            try ( // Reading using Character Stream (InputStreamReader)
                    FileReader charReader = new FileReader(fileName)) {
                int charRead;
                System.out.println("Content using Character Stream:");
                while ((charRead = charReader.read()) != -1) {
                    System.out.print((char) charRead);
                }
            }

            try ( // Reading using Byte Stream (FileInputStream)
                    FileInputStream byteReader = new FileInputStream(fileName)) {
                int byteRead;
                System.out.println("\nContent using Byte Stream:");
                while ((byteRead = byteReader.read()) != -1) {
                    System.out.print((char) byteRead);
                }
            }

        } catch (IOException e) {
        }
    }
}
   