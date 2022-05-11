package student23;

import java.util.Objects;

public class Person {

    String FirstName = "";
    String LastName = "";
    int age = 0;
    String ssn ="";
    String name = "";
    public Person(String firstName, String lastName, int age, String ssn) {
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return ssn.equals(person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FirstName, LastName, age, ssn);
    }
}
