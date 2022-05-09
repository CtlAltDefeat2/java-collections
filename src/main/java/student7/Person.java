package student7;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String SocialSecurity;

    public Person(String firstName, String lastName, int age, String socialSecurity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.SocialSecurity = socialSecurity;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return SocialSecurity.equals(person.SocialSecurity);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, SocialSecurity);
    }
}
