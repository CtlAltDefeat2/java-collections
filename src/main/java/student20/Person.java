package student20;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Person {

    private String name;
    private String lastname;
    private int age;
    private String SSN;

    Person(){}


    public Person  ( String name, String lastname, int age, String SSN) {
        this.name=name;
        this.lastname=lastname;
        this.age=age;
        this.SSN=SSN;
    }
    public Person (String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {

        return name;
    }
    public String getLastname() {

        return lastname;
    }
    public int getAge() {

        return age;
    }
    public String getSSN() {

        return SSN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return  this.SSN.equals(person.SSN);
    }
    @Override
    public int hashCode() {

        return Objects.hash(getName(), getLastname(), getAge(), getSSN());
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
