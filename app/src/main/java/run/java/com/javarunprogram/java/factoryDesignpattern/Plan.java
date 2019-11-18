package run.java.com.javarunprogram.java.factoryDesignpattern;

 abstract class Plan {
    protected int rate;

    abstract void getRate();

    public void calculation(int unit) {
        System.out.println(rate * unit);
    }

}
