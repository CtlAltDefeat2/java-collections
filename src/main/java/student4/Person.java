package student4;


import java.util.Objects;

public class Person {
        //Data Members//
        private String firstName;
        private String lastName;
        private Integer age;
        private String ssn;
        //Constructors//
        public Person(String firstName, String lastName, Integer age, String ssn) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.ssn = ssn;
        }
        //Methods//
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
//Override equals object//
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return  Objects.equals(ssn, person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, ssn);
    }
}

























