package student2;

import java.util.Objects;

public class Person{
    String firstName, lastName, ssn;
    private Integer age;

    public String getSsn() {
        return this.ssn;
    }

    public Person(String firstName, String lastName, Integer age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.age = age;
    }
    public Person(){
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return ssn== person.ssn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, ssn, age);
    }

    @Override
    public String toString() {
        return firstName +" "+
                lastName + ", " +
                age+", "+
                ssn;
    }
}
