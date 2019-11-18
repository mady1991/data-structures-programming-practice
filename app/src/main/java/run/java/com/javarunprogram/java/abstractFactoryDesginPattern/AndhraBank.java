package run.java.com.javarunprogram.java.abstractFactoryDesginPattern;

public class AndhraBank implements Bank {
    String name = null;

    public AndhraBank() {
        name = "Andhra Bank";
    }

    @Override
    public String getName() {
        return name;
    }
}