package Lab06;

public class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void brake() {
        System.out.println("Sedan braking!");
    }
}
