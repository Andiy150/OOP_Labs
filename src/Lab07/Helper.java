package Lab07;

import java.util.List;

public class Helper {
    public static Car selectRandomCar(List<Car> cars) {
        int randomIndex = new java.util.Random().nextInt(cars.size());
        return cars.get(randomIndex);
    }

    public static void driverArrived(String driverName) {
        System.out.println("Водій " + driverName + " прибув на місце");
    }
}
