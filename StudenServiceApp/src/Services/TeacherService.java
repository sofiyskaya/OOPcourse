package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teachers;
    private String acadDegree;
    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
        public List<Teacher> getAll(){
            return teachers;
        }

    @Override
        public void create(String firstName, int age, String acadDegree) {
                Teacher per = new Teacher(firstName, age, acadDegree);
                teachers.add(per);
        }


    public void sortByFIOStdLst() {
        teachers.sort(new PersonComparator<Teacher>());
    }


    public <T extends Teacher> void paySalary(T person) {
        System.out.println(person.getName() + " - выплачена зарплата 120 000 руб.");
    }

    @Override
    public String toString() {
        String res = "\nTeachers:";

        for (Teacher teacher : teachers) {
            res = res + "\n" + teacher;
        }
        return res;
    }
    
}