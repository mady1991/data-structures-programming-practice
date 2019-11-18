package run.java.com.javarunprogram.java.DecoratorPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoodCustomer {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1 for vegfood");
        System.out.println("2 for nonvegfood");
        System.out.println("3 for  Chinese food");
        System.out.println("4 for  exit");


        int response = Integer.parseInt(bufferedReader.readLine());


        switch (response) {

            case 1:
                VegFood vegFood = new VegFood();
                System.out.println(vegFood.prepareFood());
                System.out.println(vegFood.foodCost());
                break;
            case 2:
                NonVedFood nonVedFood = new NonVedFood(new VegFood());
                System.out.println(nonVedFood.prepareFood());
                System.out.println(nonVedFood.foodCost());
                break;
            case 3:
                ChineseFood chineseFood = new ChineseFood(new VegFood());
                System.out.println(chineseFood.prepareFood());
                System.out.println(chineseFood.foodCost());
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}
