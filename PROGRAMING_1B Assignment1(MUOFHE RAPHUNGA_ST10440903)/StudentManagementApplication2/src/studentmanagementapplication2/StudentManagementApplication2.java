/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagementapplication2;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class StudentManagementApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Information Menu");
            System.out.println("1. Add student");
            System.out.println("2. Search for student");
            System.out.println("3. Delete student");
            System.out.println("4. Display student report");
            System.out.println("5. Exit student application");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Student.saveStudent();
                    break;
                case 2:
                    Student.searchStudent();
                    break;
                case 3:
                    Student.deleteStudent();
                    break;
                case 4:
                    Student.studentReport();
                    break;
                case 5:
                    System.out.println("End of progress, Goodbye :)");
                    Student.exitStudentApplication();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
    



    
        
        
    
