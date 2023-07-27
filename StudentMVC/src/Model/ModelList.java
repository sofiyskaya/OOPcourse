package Model;

import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

public class ModelList implements iGetModel {
    private List<Student> students = new ArrayList<>();

    public ModelList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents()
    {
        return students;
    }

    @Override
    public boolean deleteStudent(long id) {
        boolean res = false;

        for (Student pers: students) {

            if (pers.getId() == id) {
                students.remove(students.indexOf(pers));
                res = true;
                break;
            }
        }
        return res;
    }
}
