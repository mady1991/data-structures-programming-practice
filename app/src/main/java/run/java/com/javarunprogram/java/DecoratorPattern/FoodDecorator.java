package run.java.com.javarunprogram.java.DecoratorPattern;

public abstract class FoodDecorator implements Food {

    Food newFood;

    FoodDecorator(Food newFood) {
        this.newFood = newFood;
    }

    @Override
    public String prepareFood() {
        return newFood.prepareFood();
    }

    @Override
    public double foodCost() {
        return newFood.foodCost();
    }
}
