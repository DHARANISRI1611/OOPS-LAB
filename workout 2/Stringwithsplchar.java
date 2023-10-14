
package stringwithsplchar;
import java.util.Scanner;

public class Stringwithsplchar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        String str= sc.next();
        String str1[] = str.split(" ");
        for(String s: str1){
            if(s.matches("[!@#$%^&*()_]+")){
                System.out.println(s);
            }
        }
    }    
}