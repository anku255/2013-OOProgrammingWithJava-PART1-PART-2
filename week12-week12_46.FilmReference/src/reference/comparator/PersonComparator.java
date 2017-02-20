/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Person;

/**
 *
 * @author Anku
 */
public class PersonComparator implements Comparator<Person>{
    
    private Map<Person, Integer> peopleIdentities;
    
    public PersonComparator(Map<Person, Integer> peopleIdentities)
    {
        this.peopleIdentities = peopleIdentities;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int n1 = peopleIdentities.get(o1);
        int n2 = peopleIdentities.get(o2);
        return n2-n1;
    }
    
}