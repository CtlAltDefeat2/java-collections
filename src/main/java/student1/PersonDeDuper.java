package student1;

import student1.Person;

import java.util.HashSet;
    public class PersonDeDuper {
        private final HashSet<Person> uniquePeople;
        public PersonDeDuper() {
            this.uniquePeople =new HashSet<>();
        }

        public String getUniquePeople() {
            String stringValue=" ";
            for(Person i : uniquePeople){
                stringValue +=i +"\n";
            }
            return stringValue ;
        }
        public void addPerson(Person i){

            uniquePeople.add(i);
        }
}
