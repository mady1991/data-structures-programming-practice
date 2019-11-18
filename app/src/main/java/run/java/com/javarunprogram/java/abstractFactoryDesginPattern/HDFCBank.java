package run.java.com.javarunprogram.java.abstractFactoryDesginPattern;

public class HDFCBank implements Bank {
    String name = null;

    public HDFCBank() {
        name = "HDFC Bank";
    }

    @Override
    public String getName() {
        return name;
    }
}
