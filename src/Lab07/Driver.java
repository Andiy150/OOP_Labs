package Lab07;

public class Driver {
    String name;
    int age;
    int drivingExperience;

    public Driver(String name, int age, int drivingExperience) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    public void increaseExperience() {
        this.drivingExperience += 1;
    }
}

