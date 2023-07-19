import java.util.ArrayList;
import java.util.List;

import Controllers.EmploeeController;
import Domen.Emploee;
import Domen.Student;
import Domen.StudentGroup;
import Domen.Teacher;
import Services.AverageAge;
import Services.EmploeeService;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Маша", 23, 301);
        Student s3 = new Student("Виктор", 22, 121);
        Student s4 = new Student("Миша",  23, 444);
        Student s5 = new Student("Даша",  23, 171);
        Student s6 = new Student("Лена",  23, 104);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        // StudentGroup group4580 = new StudentGroup(listStud, 4580);

        // List<Student> listStud2 = new ArrayList<Student>();
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        StudentGroup group4580 = new StudentGroup(listStud, 4580);


        // List<StudentGroup> streamGroups = new ArrayList<StudentGroup>();
 
        // streamGroups.add(group4580);
        // streamGroups.add(group4581);
        // StudentStream streamStud = new StudentStream(streamGroups, 1);

        // System.out.println("\n====print groups of a stream===>");

        // for(StudentGroup group: streamStud)
        // {
        //     System.out.println(group);
        // }

        // System.out.println("\n==============groups sorted===>");

        // // Collections.sort(streamStud.getStream());
        // Collections.sort(group4580.getGroup());
        // Collections.sort(group4581.getGroup());

        // System.out.println(streamStud);


        // Student s1 = new Student("Иван", 25, 121);
        // Student s2 = new Student("Маша", 23, 301);

        // PersonComparator<Student> comS = new PersonComparator<Student>();
        // comS.compare(s1, s2);
        
        

        // PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        // comT.compare(t1, t2);

        // PersonComparator<Person> comP = new PersonComparator<Person>();
        // comP.compare(s1, t2);

        Emploee e1 = new Emploee("Федорович", 60, "разнорабочий");

        EmploeeService emploees = new EmploeeService();

        emploees.create("Евгения", 40, "Уборщица");


        Teacher t1 = new Teacher("Иван Петрович", 50, "Docent");
        Teacher t2 = new Teacher("Мария Александровна", 33, "Professor");

        TeacherService teachers = new TeacherService();

        teachers.create(t1.getName(), t1.getAge(), t1.getAcadDegree());
        teachers.create(t2.getName(), t2.getAge(), t2.getAcadDegree());
        teachers.create("Ирина Владимировна", 30, "Assistant");
        teachers.create("Михаил Фeдорович", 70, "PhD");
        

        System.out.println("\n===========pay to professor===>");
        teachers.paySalary(t2);

        System.out.println("\n==========teachers unsorted===>");
        System.out.println(teachers);

        System.out.println("\n============teachers sorted===>");
        teachers.sortByFIOStdLst();
        System.out.println(teachers);

        // average age of teachers
        System.out.println("\nAverage age of teachers  = " + (new AverageAge<Teacher>()).getAveAge(teachers.getAll()));

        // average age of employees
        System.out.println("\nAverage age of employees = " + (new AverageAge<Emploee>()).getAveAge(emploees.getAll()));

        // average age of students
        System.out.println("\nAverage age of students = " + (new AverageAge<Student>()).getAveAge(group4580.getGroup()));
        

    }
}
