
package miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
class Student {
    String name;
    int age;
    String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
public class StudentManagementSystem extends JFrame {
    private List<Student> students = new ArrayList<>();
    private JTextArea displayArea;
public StudentManagementSystem() {
        setTitle("Student Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        displayArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(displayArea);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
       
        JButton addButton = new JButton("Add Student");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        JButton viewButton = new JButton("View Students");
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewStudents();
            }
        });

        panel.add(addButton);
        panel.add(viewButton);

        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void addStudent() {
        String name = JOptionPane.showInputDialog("Enter student name:");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter student age:"));
        String grade = JOptionPane.showInputDialog("Enter student grade:");

        Student student = new Student(name, age, grade);
        students.add(student);

        displayArea.append("Student added: " + student.name + "\n");
    }

    private void viewStudents() {
        displayArea.setText("List of Students:\n");
        for (Student student : students) {
            displayArea.append("Name: " + student.name + ", Age: " + student.age + ", Grade: " + student.grade + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentManagementSystem().setVisible(true);
            }
        });
    }
}