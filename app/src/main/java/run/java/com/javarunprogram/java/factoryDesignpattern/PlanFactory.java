package run.java.com.javarunprogram.java.factoryDesignpattern;

public class PlanFactory {

    public static Plan getPlan(String name) {
        Plan plan = null;
        switch (name) {
            case "private":
                plan = new PrivatePlan();
                break;

            case "commerical":
                plan = new CommercicalPlan();
                break;

            case "indivisual":
                plan = new IndivisualPlan();
                break;
        }

        return plan;
    }
}
