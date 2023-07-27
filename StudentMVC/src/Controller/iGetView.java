package Controller;

import java.util.List;

import Model.Student;

public interface iGetView {

    // Метод выводит информацию о каждом студенте на консоль
    void printAllStudent(List<Student> students);

    // Метод для запроса ввода пользователя, чтобы получить команду или данные от него
    String prompt(String msg);

    // Метод для получения id студента, которого нужно удалить.
    Long getStudentIdToDelete();

    // Метод отображает информацию о каждом студенте
    void displayStudents(List<Student> students);

    // Метод для чтения данных о студенте.
    Student readStudent();

    // Метод для получения id студента, которого пользователь хочет обновить.
    Long getStudentIdToUpdate();

    void printAllStudents(List<Student> students);

    // message on delete
    String msgOnDelete(long id, boolean result);
    
}