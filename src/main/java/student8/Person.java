package student8;

import java.util.Objects;

public class Person {

    String fName;
    String lName;
    int age;
    String bDay;

    Person(String fName, String lName, int age, String bDay) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.bDay = bDay;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)  {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && fName.equals(person.fName) && lName.equals(person.lName) && bDay.equals(person.bDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName, age, bDay);
    }
}
