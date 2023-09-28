package javaapplication20;
import YEAR_I.YearIMarks;
import YEAR_II.YearIIMarks;
import java.util.Scanner;
class Student {
    int rollNumber;
    String name;
    YearIMarks year1Marks;
    YearIIMarks year2Marks;
    public Student(int rollNumber, String name, YearIMarks year1Marks, YearIIMarks year2Marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.year1Marks = year1Marks;
        this.year2Marks = year2Marks;
    }
    public void displayResult() {
        String result = "Roll Number: " + rollNumber + "\n";
        result += "Name: " + name + "\n";
        result += "Year I Marks - Sub1: " + year1Marks.getSub1mark() + ", Sub2: " + year1Marks.getSub2mark() + "\n";
        result += "Year II Marks - Sub3: " + year2Marks.getSub3mark() + ", Sub4: " + year2Marks.getSub4mark() + "\n";

        // Calculate Grade for each subject
        result += "Result: ";

        if (year1Marks.getSub1mark() >= 50 && year1Marks.getSub2mark() >= 50 &&
            year2Marks.getSub3mark() >= 50 && year2Marks.getSub4mark() >= 50) {
            result += "Pass";
        } else {
            result += "Fail";
        }

        System.out.println(result);
    }
}
public class javaapplication20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll Number for student " + (i+1) + ": ");
            int rollNumber = scanner.nextInt();

            System.out.print("Enter Name for student " + (i+1) + ": ");
            String name = scanner.next();

            System.out.print("Enter Year I Marks - Sub1: ");
            int sub1mark = scanner.nextInt();

            System.out.print("Enter Year I Marks - Sub2: ");
            int sub2mark = scanner.nextInt();

            System.out.print("Enter Year II Marks - Sub3: ");
            int sub3mark = scanner.nextInt();

            System.out.print("Enter Year II Marks - Sub4: ");
            int sub4mark = scanner.nextInt();
            YearIMarks year1Marks = new YearIMarks(sub1mark, sub2mark);
            YearIIMarks year2Marks = new YearIIMarks(sub3mark, sub4mark);
            Student student = new Student(rollNumber, name, year1Marks, year2Marks);
            student.displayResult();
        }
    }
}

