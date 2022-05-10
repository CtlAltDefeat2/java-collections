package student25;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;
    private Integer age;
    private String ssn;

    public Person(String name, String lastName, Integer age, String ssn) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }
    //The Person class overrides the equals' method.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return ssn == person.ssn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, ssn);
    }

    @Override
    public String toString() {
        return name + " "+  lastName+ ", "+ age + ", " + ssn + '\n';
    }
}
