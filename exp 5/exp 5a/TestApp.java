
package testapp;
import pack1.MathOperations;
import pack2.StringOperations_1;
import pack3.Calculator;

public class TestApp {
    public static void main(String[] args) {
        // Testing pack1.MathOperations
        MathOperations mathOps = new MathOperations();
        int sum = mathOps.add(10, 5);
        int difference = mathOps.subtract(10, 5);

        // Testing pack2.StringOperations
        StringOperations_1 strOps = new StringOperations_1();
        String concatenated = strOps.concatenate("Hello", " World");
        String reversed = strOps.reverse("OpenAI");

        // Testing pack3.Calculator
        Calculator calc = new Calculator();
        int product = calc.multiply(8, 3);
        String divisionResult = calc.divide(10, 2);
        String divisionByZero = calc.divide(10, 0);

        // Printing results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Concatenated String: " + concatenated);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Product: " + product);
        System.out.println("Division Result: " + divisionResult);
        System.out.println("Division by Zero: " + divisionByZero);
    }
}