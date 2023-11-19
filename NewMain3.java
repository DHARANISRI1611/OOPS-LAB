package javaapplication39;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private final String name;
    private final int rollNo;
    private final double cgpa;

    public Student(String name, int rollNo, double cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", cgpa=" + cgpa +
                '}';
    }
}

public class  NewMain3{
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            studentList.add(new Student("Student" + i, i, Math.random() * 4.0));
        }

        System.out.println("Unsorted Student Details:");
        displayStudentDetails(studentList);
        Collections.sort(studentList, Comparator.comparingInt(Student::getRollNo));

        System.out.println("\nSorted Student Details based on Roll Number:");
        displayStudentDetails(studentList);
    }


    private static void displayStudentDetails(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}