package student21;

import java.util.HashMap;
import java.util.HashSet;

public class PersonDeDuper {

    private HashSet<Person> personSet = new HashSet<Person>();


// adds person to the set, the second "person" after the object type is just a pointer, so it can be called anything,
// and to demonstrate this I called it "bacon"
    public void addPerson(Person bacon){
        personSet.add(bacon);
        //people.put();
    }




//  Similar to bacon the "pork" value in here represents the person object passing through the argument
    public String getUniquePeople() {
        String retVal = ""; //This is the string that will be sent back once this method is called,
       for (Person pork: personSet) { // for each Person as pork in personSet
           retVal+= pork.getFirstName()+ " " +pork.getLastName() + " " + pork.getAge() + " " + pork.getSsn() + '\n'; // do something with p

       }
        return retVal;
    }
}
