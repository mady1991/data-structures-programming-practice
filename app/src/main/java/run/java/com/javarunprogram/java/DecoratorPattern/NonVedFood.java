package run.java.com.javarunprogram.java.DecoratorPattern;

public class NonVedFood extends FoodDecorator {
    NonVedFood(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + "Chicken tandoori";
    }

    @Override
    public double foodCost() {
        return super.foodCost() + 192;
    }
}
