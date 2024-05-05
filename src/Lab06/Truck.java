package Lab06;

public class Truck extends Car {
    public Truck(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void brake() {
        System.out.println("Truck braking!");
    }
}
