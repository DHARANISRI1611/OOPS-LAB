
package swapfirstlast;
public class Swapfirstlast {
    public static void main(String[] args) {
        String inputString = "This is a sample sentence for testing";
        String[] words = inputString.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 1) {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                char[] wordArray = word.toCharArray();
                wordArray[0] = lastChar;
                wordArray[wordArray.length - 1] = firstChar;
                words[i] = new String(wordArray);
            }
        }
        String modifiedString = String.join(" ", words);
        System.out.println("Original String: " + inputString);
        System.out.println("Modified String: " + modifiedString);
    }
}

 