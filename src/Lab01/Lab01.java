package Lab01;

import java.util.Random;

public class Lab01 {
    public void processTask1() {
        Random random = new Random();
        int[] numbers = new int[10];
        int sum = 0, difference = 0, product = 1;
        double quotient = 1.0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1; // Generate random numbers from 1 to 100
            sum += numbers[i];
            if (i == 0) {
                difference = numbers[i];
                product = numbers[i];
                quotient = numbers[i];
            } else {
                difference -= numbers[i];
                product *= numbers[i];
                quotient /= numbers[i];
            }
        }

        System.out.print("Generated numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }

    public void processTask2() {
        String word1 = "Цей", word2 = "простий", word3 = "приклад", word4 = "з", word5 = "десяти",
                word6 = "слів", word7 = "для", word8 = "демонстрації", word9 = "в", word10 = "Java.";
        String sentence = word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5 + " " +
                word6 + " " + word7 + " " + word8 + " " + word9 + " " + word10;
        System.out.println(sentence);
    }

    public void processTask3() {
        User[] users = new User[10];
        double totalAge = 0, totalWeight = 0, totalHeight = 0;
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(i, 20 + i, "Name" + i, "Surname" + i, 60 + i, 170 + i);
            totalAge += users[i].age;
            totalWeight += users[i].weight;
            totalHeight += users[i].height;
        }
        System.out.println("Total age: " + totalAge);
        System.out.println("Total weight: " + totalWeight);
        System.out.println("Total height: " + totalHeight);
    }

    public void processTask4() {
        Car[] cars = new Car[10];
        double totalVolume = 0, totalPower = 0;
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(100 + i, 1.0 + i * 0.1, "Model" + i, "Color" + i, 2010 + i, "Type" + i, 4 + i);
            totalVolume += cars[i].engineVolume;
            totalPower += cars[i].horsePower;
        }
        System.out.println("Total engine volume: " + totalVolume);
        System.out.println("Total power: " + totalPower);
    }

    public void processTask5() {
        int number = 412;
        int reversed = (number % 10) * 100 + ((number / 10) % 10) * 10 + (number / 100);
        System.out.println("Reversed number: " + reversed);
    }
}
