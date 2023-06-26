public class Eagle extends Birds implements Flyable {
    @Override
    void voice() {
        System.out.println("I let out an intermittent cry");
    }

    @Override
    void sleep() {
        System.out.println("I can sleep");
    }

    @Override
    void eat() {
        System.out.println("I can eat");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
