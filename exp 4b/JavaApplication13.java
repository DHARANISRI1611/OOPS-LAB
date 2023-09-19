
package javaapplication13;

import java.util.Scanner;

interface Resizable {
    void resize(double factor);
}

class Rectangle implements Resizable {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    public void printPerimeter() {
        System.out.println("Perimeter of Rectangle: " + 2 * (length + breadth));
    }

    
    public void resize(double factor) {
        this.length *= factor;
        this.breadth *= factor;
    }
}

class Circle implements Resizable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void printArea() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    public void printPerimeter() {
        System.out.println("Perimeter of Circle: " + (2 * Math.PI * radius));
    }

    @Override
    public void resize(double factor) {
        this.radius *= factor;
    }
}

public class JavaApplication13  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of Rectangle: ");
        double breadth = sc.nextDouble();

        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.printArea();
        rectangle.printPerimeter();

        System.out.print("\nEnter resize factor for Rectangle: ");
        double resizeFactorRectangle = sc.nextDouble();
        rectangle.resize(resizeFactorRectangle);
        rectangle.printArea();
        rectangle.printPerimeter();

        System.out.print("\nEnter radius of Circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        circle.printArea();
        circle.printPerimeter();

        System.out.print("\nEnter resize factor for Circle: ");
        double resizeFactorCircle = sc.nextDouble();
        circle.resize(resizeFactorCircle);
        circle.printArea();
        circle.printPerimeter();
    }
}

