package run.java.com.javarunprogram.java.AdapterPattern;

public class MainClass {
    public static void main(String[] args) {
        Bird bird = new Saprrow();
        ToyDuck toyDuck = new PlasticToyDuck();


        bird.makeSound();
        bird.fly();
        toyDuck.squeak();

        Adapter adapter = new Adapter(bird);
        adapter.squeak();

    }
}
