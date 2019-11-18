package run.java.com.javarunprogram.java.AdapterPattern;

public class Adapter implements ToyDuck {

    Bird bird;

    Adapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}
