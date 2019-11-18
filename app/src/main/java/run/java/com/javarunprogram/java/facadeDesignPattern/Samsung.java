package run.java.com.javarunprogram.java.facadeDesignPattern;

public class Samsung implements Mobile {
    @Override
    public String mobile() {
        return "Samsung Mobile";
    }

    @Override
    public String price() {
        return "67000";
    }
}
