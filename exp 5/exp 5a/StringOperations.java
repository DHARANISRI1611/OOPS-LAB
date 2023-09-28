package pack2;
public class StringOperations {

    public String concatenate(String str1, String str2)
    {
        return str1 + str2;
    }
    public String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
   