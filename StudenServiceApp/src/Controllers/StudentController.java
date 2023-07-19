package Controllers;

import Domen.Student;
import Services.StudentService;

public class StudentController implements iPersonController<Student> {
    private final StudentService dataService = new StudentService();

    //Метод регистрации студената в базе данных
    @Override
    public void create(String firstName, int age, String progress) {
        dataService.create(firstName,age, progress);
        dataService.sortByFIOStdLst();
    }

}