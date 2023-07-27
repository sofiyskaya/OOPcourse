package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

// Class ViewEng implements interface iGetView and intended to communicate with user in English
public class ViewEng implements iGetView {

    // method to print all students from a list in English
    public void printAllStudents(List<Student> students)
    {
        System.out.println("------List of students--------");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("===============================");
    }

    @Override
    public void printAllStudent(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printAllStudent'");
    }

    // method to prompt from user by invitation
    @Override
    public String prompt(String msg) {
       Scanner in = new Scanner(System.in);
       System.out.print(msg);
       return in.nextLine();
    }

    // method to get ID of the student to delete
    @Override
    public Long getStudentIdToDelete() {
        long id = Integer.parseInt(prompt("Enter ID of the student to delete: "));
        return id;
    }

    @Override
    public void displayStudents(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayStudents'");
    }

    @Override
    public Student readStudent() {
        return null;
    }

    @Override
    public Long getStudentIdToUpdate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToUpdate'");
    }

    @Override
    public String msgOnDelete(long id, boolean result) {
        if (result) {
            return "Student with ID " + id + " has been successfully deleted!";
        } else {
            return "Student with ID " + id + " has NOT been found in database!";
        }
    }
    
}
