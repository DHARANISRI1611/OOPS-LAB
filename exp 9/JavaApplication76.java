package javaapplication76;
import java.io.*;
public class JavaApplication76 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the file name: ");
            String fileName = reader.readLine();

            File file = new File(fileName);

            if (file.exists()) {
                System.out.println("File exists.");
                System.out.println("Is readable: " + file.canRead());
                System.out.println("Is writable: " + file.canWrite());
                System.out.println("File type: " + getFileType(file));
                System.out.println("File length (in bytes): " + file.length());
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException e) {
        }
    }

    private static String getFileType(File file) {
        if (file.isDirectory()) {
            return "Directory";
        } else if (file.isFile()) {
            return "Regular File";
        } else {
            return "Unknown";
        }
    }
}
  