package run.java.com.javarunprogram.java.AdapterPattern;

public class Saprrow implements Bird {
    @Override
    public void makeSound() {
        System.out.println("Chrip chrip");
    }

    @Override
    public void fly() {
        System.out.println("Saprrow is fyling");
    }
}
