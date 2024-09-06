/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package studentmanagementapplication2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;


/**
 *
 * @author RC_Student_lab
 */
public class StudentManagementApplication2Test {
  


   
public class StudentTest {
        @Test
    public void testMain() {
    }
    public static boolean age(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setId(String string) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    private Student student;

    @Test
    public void testSetId() {
        student.setId("20222");
        assertEquals("20222", student.getId());
    }

    @Test
    public void testSetName() {
        student.setName("A. Smith");
        assertEquals("A. Smith", student.getName());
    }

    @Test
    public void testSetAge() {
        student.setAge(20);
        assertEquals(20, student.getAge());
    }

    @Test
    public void testSetEmail() {
        student.setEmail("asmith@example.com");
        assertEquals("asmith@example.com", student.getEmail());
    }

    @Test
    public void testSetCourse() {
        student.setCourse("cs");
        assertEquals("cs", student.getCourse());
    }

    @Test
    public void testGetId() {
        assertEquals("10111", student.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("J. Bloggs", student.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(19, student.getAge());
    }

    @Test
    public void testGetEmail() {
        assertEquals("jbloggs@ymail.com", student.getEmail());
    }

    @Test
    public void testGetCourse() {
        assertEquals("disd", student.getCourse());
    }

    @Test
    public void testSaveStudent() {
        // Test Purpose: To supply the student ID, name, age, email, and course to the save student method.
        Scanner scanner = new Scanner("10111\nJ. Bloggs\n19\njbloggs@ymail.com\ndisd\n");
        Student.saveStudent();
        
        // Verify that the student is saved to the list
        assertEquals(1, Student.students.size());
        Student savedStudent = Student.students.get(0);
        
        assertEquals("10111", savedStudent.getId());
        assertEquals("J. Bloggs", savedStudent.getName());
        assertEquals(19, savedStudent.getAge());
        assertEquals("jbloggs@ymail.com", savedStudent.getEmail());
        assertEquals("disd", savedStudent.getCourse());
    }

    @Test
    public void testSearchStudent() {
        // Test Purpose: To supply the student ID to the search student method and verify that correct student details are returned.
        Scanner scanner = new Scanner("10111\nJ. Bloggs\n19\njbloggs@ymail.com\ndisd\n");
        Student.saveStudent();
        
        scanner = new Scanner("10111\n");
        Student foundStudent = Student.searchStudent;
        
        assertNotNull(foundStudent);
        assertEquals("10111", foundStudent.getId());
    }

    @Test
    public void testSearchStudent_StudentNotFound() {
        // Test Purpose: To supply an incorrect student ID to the search student method and ensure no student is found.
        Scanner scanner = new Scanner("55555\n");
        Student foundStudent = Student.searchStudent;
        
        assertNull(foundStudent);
    }

    @Test
    public void testDeleteStudent() {
        // Test Purpose: To supply the student ID to the delete student method and verify the student is successfully deleted.
        Scanner scanner = new Scanner("10111\nJ. Bloggs\n19\njbloggs@ymail.com\ndisd\n");
        Student.saveStudent();
        
        scanner = new Scanner("10111\ny\n");
        boolean deleted = Student.deleteStudent;
        
        assertTrue(deleted);
        assertEquals(1, Student.students.size());
    }

    @Test
    public void testDeleteStudent_StudentNotFound() {
        // Test Purpose: To supply an incorrect student ID to the delete student method and verify no student is deleted.
        Scanner scanner = new Scanner("55555\n");
        boolean deleted = Student.deleteStudent;
        
        assertFalse(deleted);
    }

    @Test
    public void testStudentAge_StudentAgeValid() {
        // Test Purpose: To supply a valid student age to the student age method and verify the age is valid.
        boolean isValid = Student.age(18);
        
        assertTrue(isValid);
    }

    @Test
    public void testStudentAge_StudentAgeInvalid() {
        // Test Purpose: To supply an invalid student age to the student age method and verify the age is less than 16.
        boolean isValid = Student.age(15);
        
        assertFalse(isValid);
    }

}
}
