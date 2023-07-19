package Services;

import java.util.List;

import Domen.Person;


public class AverageAge<T extends Person> {
    
    public double getAveAge(List<T> list) {
        double res = 0;
        for (T per : list)
            res += per.getAge();
            res = res / list.size();
        return res;
    }

}