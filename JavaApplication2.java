
package javaapplication2;
import java.util.*;
public class JavaApplication2 
{
 public static void main(String[] args) 
 {
      Scanner in = new Scanner (System.in);
      int a,b,y,m,d;
      System.out.println("enter a");
      a=in.nextInt();
      y=a/365;
      b=a%365;
      m=b/30;
      d=b%30;
      System.out.println("The number of years="+y);
      System.out.println("The number of months ="+m);
      System.out.println("The number of days="+d);
    }
} 
  
