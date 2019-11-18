package run.java.com.javarunprogram.java.factoryDesignpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

    public static void main(String[] args) throws IOException {
        PlanFactory planFactory = new PlanFactory();


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please Enter The Name of Plan. you have below given choice" + "\n" + "1.private" + "\n" + "2.commercial" + "\n" + "3.indivisual");
        String planName = bufferedReader.readLine();
        System.out.println("plan name---" + planName);

        System.out.println("Please Enter the no of units" + "Only Numbers are allowed");
        int units = Integer.parseInt(bufferedReader.readLine());

        Plan plan = planFactory.getPlan(planName);


        plan.getRate();
        System.out.println("Rate--" + plan.rate);
        plan.calculation(units);

    }
}
