package Lab06;

abstract class Car {
    protected String model;
    protected String color;
    protected int maxSpeed;

    public void gas() {
        System.out.println("Accelerating!");
    }

    abstract void brake();
}
