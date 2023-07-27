package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

// Class View implements interface iGetView and intended to communicate with user in Russian
public class View implements iGetView {

    // method to print all students from a list in Russian
    public void printAllStudents(List<Student> students)
    {
        System.out.println("------список студентов--------");
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

    @Override
    public String prompt(String msg) {
       Scanner in = new Scanner(System.in);
       System.out.print(msg);
       return in.nextLine();
    }

    // method to get ID of the student to delete
    @Override
    public Long getStudentIdToDelete() {
        long id = Integer.parseInt(prompt("Введите ID студента для удаления:"));
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
        long id = Integer.parseInt(prompt("Введите ID студента для изменения данных: "));
        return id;
    }

    @Override
    public String msgOnDelete(long id, boolean result) {
        if (result) {
            return "Студент с ID " + id + " успешно удален!";
        } else {
            return "Студент с ID " + id + " в базе данных НЕ найден!";
        }
    }
    
}