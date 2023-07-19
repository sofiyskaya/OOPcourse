package Controllers;


import Domen.Teacher;
import Services.TeacherService;

public class TeacherController implements iPersonController<Teacher> {
    private final TeacherService teachService = new TeacherService();


    @Override
    public void create(String firstName, int age, String acadDegree) {
        teachService.create(firstName,age,acadDegree);
        teachService.sortByFIOStdLst();
    }
}
