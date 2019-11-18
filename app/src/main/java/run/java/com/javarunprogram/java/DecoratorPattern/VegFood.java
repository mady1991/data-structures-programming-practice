package run.java.com.javarunprogram.java.DecoratorPattern;

public class VegFood implements Food {


    @Override
    public String prepareFood() {
        return "Veg Food";
    }

    @Override
    public double foodCost() {
        return 50;
    }
}
