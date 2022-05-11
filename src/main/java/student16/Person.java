package student16;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private String ssn;


    public Person(String name, String lastName, int age, String ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
        this.lastName = lastName;
    }

    public Person(String name, int age) {
    this.age = age;
    this.name = name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return ssn.equals(person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, ssn);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
               // ", ssn='" + ssn + '\'' +
                '}';
    }
}

