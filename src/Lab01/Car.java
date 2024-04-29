package Lab01;

public class Car {
    public double horsePower, engineVolume;
    public String model, color, type;
    public int year, doors, gears;

    public Car(double horsePower, double engineVolume, String model, String color, int year, String type, int gears) {
        this.horsePower = horsePower;
        this.engineVolume = engineVolume;
        this.model = model;
        this.color = color;
        this.year = year;
        this.type = type;
        this.gears = gears;
        this.doors = 4; // standard number of doors
    }
}
