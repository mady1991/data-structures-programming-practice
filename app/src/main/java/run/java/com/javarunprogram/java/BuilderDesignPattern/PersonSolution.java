package run.java.com.javarunprogram.java.BuilderDesignPattern;

public class PersonSolution {

    String firstName;
    String lastName;
    String age;
    String id;

    PersonSolution(String firstName, String lastName, String age, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String age;
        private String id;


        Builder() {
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public PersonSolution build() {
            return new PersonSolution(firstName, lastName, age, id);
        }


    }
}
