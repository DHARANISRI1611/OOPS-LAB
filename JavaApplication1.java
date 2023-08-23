//SUM AND PRODUCT OF DIGITS
package javaapplication1;
import java .util.*;
    class operation
    {
    int a;
    int b;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void Sum()
    {
        int c;
        c=a+b;
        System.out.println("SUM:"+c);
    }
    void product()
    {
        int c;
        c=a*b;
        System.out.println("PRODUCT:"+c);
    }
}   
    public class JavaApplication1 
    {
       public static void main(String[] args) 
       {
        operation o1=new operation();
        o1.getdata();
        o1.Sum();
        o1.product();
    }
    
}
