
package javaapplication12;
import java.util.Scanner;

abstract class Shape {
    protected int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public double getPerimeter() {
        // Assuming it's an equilateral triangle
        return 3 * base;
    }
}

public class JavaApplication12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Area of the rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double triangleHeight = sc.nextDouble();
        Triangle triangle = new Triangle(base, triangleHeight);
        System.out.println("Area of the triangle: " + triangle.getArea());
        System.out.println("Perimeter of the triangle: " + triangle.getPerimeter());
       
    }
}//
