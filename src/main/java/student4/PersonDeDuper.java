package student4;

public class PersonDeDuper {
    private String firstName;
    private String lastName;
    private Integer age;

    public PersonDeDuper(String firstName, String lastName, Integer age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getSsn() {
        return ssn;
    }

    private String ssn;
}
