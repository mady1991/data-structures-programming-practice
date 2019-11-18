package run.java.com.javarunprogram.java.AdapterPattern;

public class PlasticToyDuck implements ToyDuck {
    @Override
    public void squeak() {
        System.out.println("loud squeak sound");
    }
}
