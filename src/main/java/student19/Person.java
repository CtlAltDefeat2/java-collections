package student19;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String ssn;

    public Person(String jon, String smith, int i, String ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;

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


}
