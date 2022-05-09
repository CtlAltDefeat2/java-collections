package student26;

import java.util.Objects;

public class Person {

    private String name;
    private String lastname;
    private int age;
    private String SSN;


    public Person  ( String name, String lastname, int age, String SSN) {
        this.name=name;
        this.lastname=lastname;
        this.age=age;
        this.SSN=SSN;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return  SSN.equals(person.SSN);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, age, SSN);
    }
}
