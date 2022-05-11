package student14;

import java.util.Objects;

public class Person {
    //data members
    private String firstName;
    private String lastName;
    private Integer age;
    private String ssn;
    //constructors

    public Person(String firstName, String lastName, Integer age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }
    public Person(String firstName, Integer age) {
        this.firstName = firstName;
        this.age = age;
    }
    //methods
    public String getName(){
        return firstName+lastName;
    }

    //overrides

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return ssn == person.ssn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName, age, ssn);
    }

//    @Override
//    public String toString() {
//        return
//                firstName + " " +
//                        lastName + " " +
//                        age + " " +
//                        ssn + " " +
//                        '\n';
//    }
    @Override
    public String toString() {
        return
                firstName + " " +
                        age + " " ;
    }
}
