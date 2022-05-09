package student5;

public class Person {
    // Variable Declarations
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    // Constructors
    public Person (String firstName, String lastName, int age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }
    // Overrides
    @Override
    public boolean equals(Object object) {
        boolean isItTrue = false;
        if (this == object) {
            isItTrue = true;
        }
        if (object == null) {
            isItTrue = false;
        }
        if (object instanceof Person) {
            Person person = (Person) object;
            if (person.ssn == this.ssn) {
                isItTrue = true;
            }
        } return isItTrue;
    }
}
