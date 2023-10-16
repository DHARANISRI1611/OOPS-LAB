package javaapplication70;
 import java.util.Scanner;
public class JavaApplication70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String input = scanner.nextLine();
        char result = findSecondMostFrequentChar(input);
        System.out.println("The given string is: " + input);
        System.out.println("The second most frequent char in the string is: " + result);
        scanner.close();
    }
    public static char findSecondMostFrequentChar(String str) {
        int[] frequency = new int[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            frequency[c]++;
        }
        int max = -1;
        int secondMax = -1;
        char maxChar = '\0';
        char secondMaxChar = '\0';
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > max) {
                secondMax = max;
                secondMaxChar = maxChar;
                max = frequency[i];
                maxChar = (char) i;
            } else if (frequency[i] > secondMax && frequency[i] < max) {
                secondMax = frequency[i];
                secondMaxChar = (char) i;
            }
        }
        return secondMaxChar;
    }
}

