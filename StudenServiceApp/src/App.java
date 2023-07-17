import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentStream;

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
        StudentGroup group4580 = new StudentGroup(listStud, 4580);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        StudentGroup group4581 = new StudentGroup(listStud2, 4581);


        List<StudentGroup> streamGroups = new ArrayList<StudentGroup>();
 
        streamGroups.add(group4580);
        streamGroups.add(group4581);
        StudentStream streamStud = new StudentStream(streamGroups, 1);

        System.out.println("\n====print groups of a stream===>");

        for(StudentGroup group: streamStud)
        {
            System.out.println(group);
        }

        System.out.println("\n==============groups sorted===>");

        // Collections.sort(streamStud.getStream());
        Collections.sort(group4580.getGroup());
        Collections.sort(group4581.getGroup());

        System.out.println(streamStud);

    }
}
