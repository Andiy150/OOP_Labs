package Lab07;

public class Car {
    String make;
    double enginePower;
    Driver driver;
    double price;
    int year;

    public Car(String make, double enginePower, Driver driver, double price, int year) {
        this.make = make;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    public void repairEngine() {
        this.enginePower *= 1.10;
    }

    public void changeDriver(Driver newDriver) {
        this.driver = newDriver;
    }

    public void increasePerformance() {
        this.enginePower *= 1.10;
        this.price *= 1.05;
    }
}
