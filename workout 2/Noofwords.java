
package noofwords;
 import java.util.Scanner;
public class Noofwords {
   
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter String:");
        String str = obj.nextLine();
        String s[] = str.split(" ");
        for(String strnew: s){
            System.out.println(strnew);
        }
        System.out.println(s.length);
    }
}
