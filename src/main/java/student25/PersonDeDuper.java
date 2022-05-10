package student25;

import java.util.HashSet;

public class PersonDeDuper {
    private final HashSet<Person> uniquePeople;

    public PersonDeDuper() {
        this.uniquePeople =new HashSet<>();
    }

    public String getUniquePeople() {
        String stringValue=" ";
        for(Person i : uniquePeople){ // loop thru uniquePeople and grab all the values add them to stringvalue then hop 1 line
            stringValue +=i +"\n";
        }
        return stringValue ;

    }
    public void addPerson(Person i){

      uniquePeople.add(i);

    }
}
