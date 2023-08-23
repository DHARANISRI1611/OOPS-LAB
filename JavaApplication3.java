
package javaapplication3;


public class JavaApplication3 {

    
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int marks=in.nextInt;
        String message;
        switch(marks)
        {
            case 10:
                message="excellent";
                break;
            case 9:
            case 8:
                message="very good";
                break;
            case 7:
            case 6:
                message="good";
                break;
            case 5:
            case 4:
            case 3:
                message="poor";
                break;
            case 2:
            case 1:
            case 0:
               message="very poor";
               break;
            default:
                message="invalid marks";
                break;
        }
        System.out.println("Greeting message"+ message);
    }
}
       
  