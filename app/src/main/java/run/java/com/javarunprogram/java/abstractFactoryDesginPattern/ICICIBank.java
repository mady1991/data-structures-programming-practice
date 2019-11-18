package run.java.com.javarunprogram.java.abstractFactoryDesginPattern;

public class ICICIBank implements Bank {
    String name = null;

    public ICICIBank() {
        name = "ICICI Bank";
    }

    @Override
    public String getName() {
        return name;
    }
}

