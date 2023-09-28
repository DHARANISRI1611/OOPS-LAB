package pack3;
public class Calculator 
{
    public int multiply(int a, int b) {
        return a * b;
    }
    public String divide(int a, int b) {
        if (b != 0) {
            return String.valueOf(a / b);
        } else {
            return "Division by zero is not allowed.";
        }
    }
}

    
