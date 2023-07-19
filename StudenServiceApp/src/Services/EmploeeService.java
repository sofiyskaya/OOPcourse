package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Emploee;

public class EmploeeService implements iPersonService<Emploee> {
        private int count;
    private List<Emploee> emploees;
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }
    
    @Override
    public List<Emploee> getAll() {
        return emploees;
    }
@Override
    public void create(String firstName, int age, String profession) {
        Emploee per = new Emploee(firstName, age, profession);
                emploees.add(per);
    }    
}
