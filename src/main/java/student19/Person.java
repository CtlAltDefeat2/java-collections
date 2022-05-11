package student19;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String ssn;
    public Person(String lName,String fName, int age, String ssn) {
        this.name = fName + " " + lName;
        this.age = age;
        this.ssn = ssn;
    }

    public Person(String fName, int age) {
        this.name = fName;
        this.age = age;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
       // return age == person.age && ssn == person.ssn && Objects.equals(name, person.name);
        return ssn.equals(person.ssn);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, ssn);
    }
    @Override
    public String toString() {
        return name + ", "+ age + ", " + ssn ;

    }
}
