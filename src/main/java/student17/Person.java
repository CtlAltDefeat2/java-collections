package student17;

public class Person {
    //
    //Data Members
    //
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;


    //
    //Constructor
    //

    public Person(String firstName, String lastName, int age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    public Person() {

    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(!(obj instanceof Person)){
            return false;
        }
        Person p = (Person) obj;
        return ssn.equals(p.ssn);
    }
}
