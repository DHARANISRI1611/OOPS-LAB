/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;
import java.util.Scanner;

class Person {
     String name;
     String address;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter address: ");
        address= scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("address: " + address);
    }
}

class Student extends Person {
  int year;
  double fee;
    public void getData() {
        super.getData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        System.out.println("Enter fee:");
        year = scanner.nextInt();
        fee=scanner.nextDouble();
    }

    public void displayData() {
        super.displayData();
        System.out.println("year: " + year);
        System.out.println("fee"+fee);
    }
}

class Staff extends Person {
    String school;
    double pay;

    public void getData() {
        super.getData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter school: ");
        school = scanner.nextLine();
        pay=scanner.nextDouble();
    }

    public void displayData() {
        super.displayData();
        System.out.println("school: " + school);
        System.out.println("pay:"+pay);
    }
}

public class JavaApplication11{
    public static void main(String[] args) {
        Student student = new Student();
        Staff staff = new Staff();

        System.out.println("Enter student details:");
        student.getData();

        System.out.println("\nEnter staff details:");
        staff.getData();

        System.out.println("\nStudent details:");
        student.displayData();

        System.out.println("\nStaff details:");
        staff.displayData();
    }
}

