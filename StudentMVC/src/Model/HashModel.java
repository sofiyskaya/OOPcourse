package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class HashModel implements iGetModel {
    private HashMap<Long,Student> students = new HashMap<>();
    private long count;

    // Creating new instance of HashModel with list of students
    public HashModel(List<Student> studList) {
        count = 1;
        for(Student stud: studList){
            students.put(count, stud);
            count++;
        }
    }

    // method to fill list of Students as a List
    public List<Student> getAllStudents(){
        return new ArrayList<Student>(students.values());
    }

    // method to fill list of Students as a HashMap
    public HashMap<Long, Student> getStudentsAsHashMap() {
        return students;
    }
    
    // method to delete a student from the HashMap by ID
    /**
     * @param id
     * @return
     */
    @Override
    public boolean deleteStudent(long id) {
        boolean res = false;

        for(long key: students.keySet()){
            if(students.get(key).getId() == id){
                students.remove(key);
                res = true;
                break;
            }
        }
        return res;
    }



}