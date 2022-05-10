package student16;

import java.util.HashSet;

public class PersonDeDuper {
    private String person;
    HashSet <Person> deDuper = new HashSet(  );

    public void addPerson(Person p) {
       deDuper.add( p );
    }

    public String getUniquePeople() {
        String retVal = ""; //use a for loop because a for loop - runs a code for a specific amount of time
        for (Person word : deDuper) {//so you only want to run the code to find all the duplicates
            retVal += word + "\n";//remember "\n" is used for formatting
        }
        return retVal;
        //remember to do the toString override in Person class for proper formatting
    }
}
