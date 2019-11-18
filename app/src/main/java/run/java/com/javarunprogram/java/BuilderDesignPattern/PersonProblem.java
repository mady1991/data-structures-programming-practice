package run.java.com.javarunprogram.java.BuilderDesignPattern;

public class PersonProblem {
    String firstName;
    String lastName;
    String age;
    String id;

    PersonProblem(String firstName, String lastName, String age, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    PersonProblem(String firstName, String age, String id) {
        this.firstName = firstName;
        this.age = age;
        this.id = id;
    }

    PersonProblem(String firstName, String id) {
        this.firstName = firstName;
        this.id = id;
    }


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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
