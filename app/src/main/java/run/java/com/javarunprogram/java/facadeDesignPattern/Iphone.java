package run.java.com.javarunprogram.java.facadeDesignPattern;

public class Iphone implements Mobile {
    @Override
    public String mobile() {
        return "Ios mobile";
    }

    @Override
    public String price() {
        return "65000";
    }
}
