import java.sql.SQLOutput;

public class Penguin extends Birds implements Floatable {
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
        System.out.println("I make a trumpet and rattle sound");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
