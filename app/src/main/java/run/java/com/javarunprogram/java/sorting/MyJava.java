package run.java.com.javarunprogram.java.sorting;

public class MyJava {
    public String firstName;
    public String lastName;

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public void display(int... values) {
        for (int s : values) {
            System.out.println(s);
        }
    }
}  