package Lab07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab07 {
    public void Task1() {
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            cars.add(new Car("Brand" + i, 100 + i * 10, new Driver("Driver" + i, 25 + i, 5 + i), 5000 + i * 100, 2010 + i));
        }

        for (int i = 0; i < cars.size() / 2; i++) {
            System.out.println("Ремонтуємо автомобіль №" + i);

            cars.get(i).repairEngine();
            cars.get(i).changeDriver(new Driver("NewDriver" + i, 30 + i, 1 + i));
        }

        for (int i = 0; i < cars.size(); i += 2) {
            System.out.println("Покращуємо автомобіль №" + i);

            cars.get(i).increasePerformance();
        }

        for (Car car : cars) {
            if (car.driver.drivingExperience < 5 && car.driver.age > 25) {
                car.driver.increaseExperience();
            }
        }

        Car selectedCar = Helper.selectRandomCar(cars);
        System.out.println("Автомобіль марки " + selectedCar.make + " з водієм " + selectedCar.driver.name + " виїхав за вами");
        Helper.driverArrived(selectedCar.driver.name);
    }
    public void Task2() {
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Smith", "123-456-7890");
        phoneBook.put("Johnson", "234-567-8901");
        phoneBook.put("Williams", "345-678-9012");

        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        String surname = "Smith";
        if (phoneBook.containsKey(surname)) {
            System.out.println(surname + "'s number: " + phoneBook.get(surname));
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }

        phoneBook.remove("Johnson");

        System.out.println("Number of entries in phone book: " + phoneBook.size());
    }
}
