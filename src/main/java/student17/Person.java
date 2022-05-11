package student17;
import java.util.Objects;
public class Person {
    //
    //Data Members
    //
    String firstName;
    String lastName;
    int age;
    String ssn;
    //
    //Constructor
    //

    public Person(String firstName, String lastName, int age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }
    public Person(String firstName, int age){
    this.firstName = firstName;
    this.age = age;
    }

    public Person() {
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return ssn.equals(person.ssn);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, ssn);
    }
    @Override
    public String toString() {
        return  firstName +
                " " + lastName +
                " " + age +
                " " + ssn;
    }
}
