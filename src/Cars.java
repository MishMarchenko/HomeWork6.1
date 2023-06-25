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
        this.wheels = wheels;
    }

    public void setDoors(int doors) {
        this.doors = doors;
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
}
