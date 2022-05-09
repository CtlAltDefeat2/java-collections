package student2;

public class Person{
    private String firstName, lastName, ssn;
    private Integer age;

    public String getSsn(String ssn) {
        return this.ssn;
    }

    public Person(String firstName, String lastName, Integer age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.age = age;
    }
    public Person(){
    }

    @Override
    public boolean equals(Object obj){
        Person person= (Person) obj;
        if (this.ssn.equals(person.ssn)){
            return true;
        } else{
            return false;
        }
    }
}
