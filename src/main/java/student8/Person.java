package student8;

import java.util.Objects;

public class Person {

    String fName;
    String lName;
    int age;
    String SSN;

    Person() {

    }

    Person(String fName, int age) {
        this.fName = fName;
        this.age = age;
    }

    Person(String fName, String lName, int age, String SSN) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.SSN = SSN;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return SSN.equals(person.SSN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName, age, SSN);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", age=" + age +
                '}';
    }
}
