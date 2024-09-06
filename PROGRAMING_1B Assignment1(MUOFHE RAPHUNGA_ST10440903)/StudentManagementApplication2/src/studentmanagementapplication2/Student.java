/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementapplication2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Student {

    static boolean deleteStudent;
    static Student searchStudent;
    public static boolean age(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    void setId(String string) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String name;
    private int id;
    private int age;
    private String email;
    private String course;

    static List<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Constructor
    public Student(String name, int id, int age, String email, String course) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    // Getters 
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }
    
    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    

    // Save Student Information
    public static void saveStudent() {
        System.out.println("Enter student Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter student Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter student Email: ");
        String email = scanner.nextLine();

        System.out.println("Enter student Course: ");
        String course = scanner.nextLine();

        students.add(new Student(name, id, age, email, course));
        System.out.println("Student added successfully");
    }

    // Search Student
    public static void searchStudent() {
        System.out.println("Enter student Id to search: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student Id: " + student.getId());
                System.out.println("Student Name: " + student.getName());
                System.out.println("Student Age: " + student.getAge());
                System.out.println("Student Email: " + student.getEmail());
                System.out.println("Student Course: " + student.getCourse());
                return;
            }
        }
        System.out.println("Student not found");
    }

    // Delete Student
    public static void deleteStudent() {
        System.out.println("Enter Id of student to delete:");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Student deleted successfully");
                return;
            }
        }
        System.out.println("Student not found");
    }

    // Display All Students
    public static void studentReport() {
        for (Student student : students) {
            student.displayInfo();
            System.out.println();
        }
    }

    // Display Student Information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
    }

    // Exit Application
    public static void exitStudentApplication() {
        System.exit(0);
    }
    
    
}
