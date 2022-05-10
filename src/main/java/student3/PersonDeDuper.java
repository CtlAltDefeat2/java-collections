package student3;

import java.util.HashSet;

public class PersonDeDuper {
        private HashSet<Person> People = new HashSet<>();

        public PersonDeDuper() {

        }

        public void addPerson(Person p) {
                People.add(p);

        }

        public String getUniquePeople() {
                String retVal = "";
                for (Person p: People){
                        retVal += p + "\n";
                }
                return retVal;
        }

}

