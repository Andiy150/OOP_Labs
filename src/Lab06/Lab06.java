package Lab06;

public class Lab06 {
    public void Task1() {
        Person person1 = new Person(); // Using default constructor
        Person person2 = new Person("John Doe", 30); // Using parameterized constructor

        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
    public void Task2() {
        Phone phone1 = new Phone("123456789", "Model1", 5.5);
        Phone phone2 = new Phone("987654321", "Model2");
        Phone phone3 = new Phone();

        phone1.receiveCall("Alice");
        phone2.receiveCall("Bob", phone2.getNumber());
        phone3.sendMessage("123456789", "987654321");

        System.out.println("Phone 1 number: " + phone1.getNumber());
    }
    public void Task4() {
        Car sedan = new Sedan("SedanModel", "Red", 180);
        Car truck = new Truck("TruckModel", "Blue", 150);

        sedan.gas();
        sedan.brake();
        truck.gas();
        truck.brake();
    }
    public void Task5() {
            ComplexNumber num1 = new ComplexNumber(3, 4);
            num1.displaySimple();
            num1.display();
            num1.displayModulus();
            num1.displayArgument();

            ComplexNumber num2 = new ComplexNumber();
            num2.setValues(1, -1);
            num2.displaySimple();
            num2.display();
            num2.displayModulus();
            num2.displayArgument();
    }
}
