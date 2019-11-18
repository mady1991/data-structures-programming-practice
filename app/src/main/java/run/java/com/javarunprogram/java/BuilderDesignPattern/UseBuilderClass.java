package run.java.com.javarunprogram.java.BuilderDesignPattern;

public class UseBuilderClass {

    public static void main(String[] args) {
        PersonProblem person = new PersonProblem("Narender", "Kumar", "28", "133896");

        person.setFirstName("Shyam");
        System.out.println(person.getFirstName());

        PersonSolution personSolution=new PersonSolution.Builder().setAge("28")
                .setFirstName("Narender").setLastName("Kumar").build();
    }
}
