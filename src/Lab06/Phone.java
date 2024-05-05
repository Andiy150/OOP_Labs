package Lab06;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0);
    }

    public Phone() {
        this("Unknown", "Unknown", 0);
    }

    public void receiveCall(String name) {
        System.out.println("Call from " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Call from " + name + " at " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Sending messages to: ");
        for (String num : numbers) {
            System.out.println(num);
        }
    }


}

