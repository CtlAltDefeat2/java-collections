package student14;

import java.util.Collections;
import java.util.HashSet;
class PersonDeDuper {
    //data members
    private HashSet<Person> uniquePeople;

    //constructors

    public PersonDeDuper() {
        this.uniquePeople = new HashSet<>();
    }

    //methods

public void addPerson (Person i){
        uniquePeople.add(i);
}
    public String getUniquePeople() {
    String stringValue = " ";
    for (Person i: uniquePeople){
        stringValue += i + "\n";
    }
        return stringValue;
    }
//overrides

}
