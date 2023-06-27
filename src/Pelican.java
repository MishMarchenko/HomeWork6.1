import java.sql.SQLOutput;

public class Pelican extends Birds implements Floatable, Flyable {
    @Override
    void eat() {
        System.out.println("I can eat");
    }

    @Override
    void sleep() {
        System.out.println("I can sleep");
    }

    @Override
    void voice() {
        System.out.println("My voice is like growling and rumbling");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
