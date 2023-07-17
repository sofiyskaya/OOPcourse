package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> group;
    private Integer idGroup;

    // конструктор для класса студентов
    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    // переопределение toSrting
     @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    // переопределение sort
    @Override
    public Iterator<Student> iterator() {
       return new Iterator<Student>() {

        private int counter;

        @Override
        public boolean hasNext() {

            if(counter<group.size())
            {
                return true;
            }
            else
            {
                return false;
            }            
        }

        @Override
        public Student next() {            
            return group.get(counter++);
        }
        
       };
        
    }

    // @Override
    //  public int compareTo(StudentGroup o) {
    //      if (group.size() == o.group.size()) {
    //          if (group.size() == o.group.size())
    //              return 0;
    //          if (group.size() > o.group.size())
    //              return 1;
    //          else
    //              return -1;
    //      }
    //      if (group.size() > o.group.size())
    //          return 1;
    //      else
    //          return -1;
    //  }
}
