package Lecture;

import java.util.Objects;
import java.util.Stack;

public final class Person implements Comparable<Person> {

    //
    // Data members
    //

    private int age;
    private String name;

    //
    // Constructors
    //

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    //
    // Overrides
    //


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int retval = 0;
        if (this.age > o.age) {
            retval = 1;
        } else {
            retval = -1;
        }
        return retval;
    }
}
