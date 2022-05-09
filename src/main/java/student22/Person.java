package student22;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;
    private Integer num;
    private String phoneNumber;

    public Person() {
    }

    public Person(String name, String lastName, Integer num, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.num = num;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getNum() {
        return num;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return  phoneNumber.equals(person.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, num, phoneNumber);
    }
}

