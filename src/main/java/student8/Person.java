package student8;

import java.util.Objects;

public class Person {

    String fName;
    String lName;
    int age;
    String SSN;

    Person(String fName, String lName, int age, String SSN) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.SSN = SSN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return SSN.equals(person.SSN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SSN);
    }
}
