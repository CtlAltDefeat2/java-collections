package student21;

import java.util.Objects;

public class Person {
    //
    //Data Members
    //
    private String firstName;
    private String lastName;
    private Integer age;
    private String ssn;



    //
    //Constructors
    //

    public Person(String firstName, String lastName, Integer age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }


    //
    //Methods
    //


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }



    //
    //Overrides
    //


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getSsn().equals(person.getSsn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSsn());
    }
}
