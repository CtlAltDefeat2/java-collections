package student11;

import java.util.HashSet;

public class PersonDeDuper {
    //Data Members
    private final HashSet<Person> uniquePeople;

//Constructor
    public PersonDeDuper() {
        this.uniquePeople =new HashSet<>();//automacally compare the value
    }

    //Methods
    public String getUniquePeople() {//print out all unique people
        String stringValue=" ";
        for(Person i : uniquePeople){
            stringValue +=i +"\n";
        }
        return stringValue ;

    }
    public void addPerson(Person i){//add to hashset

        uniquePeople.add(i);

    }
}
