public class Cars {
    private String color;
    private int wheels;
    private int doors;
    public Cars(String color, int doors, int wheels){
        this.color = color;
        this.doors = doors;
        this.wheels = wheels;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setWheels(int wheels) {
        if (wheels > 4 || wheels < 3){
            try {
                throw new Exception("we produce machines with 4 wheels. as an exception, there may be 3");
            } catch (Exception e){
                throw new RuntimeException(e);
            }
        }this.wheels = wheels;
    }

    public void setDoors(int doors) {
        if (doors > 5 || doors < 3){
            try {
                throw new Exception("pattern violation. we produce cars with 3,4,5 doors");
            } catch (Exception e){
                throw new RuntimeException(e);
            }
        }this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return "Cars: " +
                "color = '" + color + '\'' +
                ", wheels = " + wheels +
                ", doors = " + doors;
    }
}
