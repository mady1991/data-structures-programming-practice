package run.java.com.javarunprogram.java.DecoratorPattern;

public class ChineseFood extends FoodDecorator {
    ChineseFood(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + "noodles kha le beta";
    }

    @Override
    public double foodCost() {
        return super.foodCost() + 7;
    }
}
