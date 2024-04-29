package Lab04;

public class Lab04 {
    // Task 1
    public int[] fillArrayWithEvenNumbers() {
        int[] evenNumbers = new int[50];
        int number = 0;
        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = number;
            number += 2;
        }
        return evenNumbers;
    }

    public int[] fillArrayWithOddNumbers() {
        int[] oddNumbers = new int[50];
        int number = 1;
        for (int i = 0; i < oddNumbers.length; i++) {
            oddNumbers[i] = number;
            number += 2;
        }
        return oddNumbers;
    }

    // Task 2
    public void arrayOperations() {
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        System.out.println("масив з 10 чисел [2,17,13,6,22,31,45,66,100,-18]");

        // Using while loop
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        // Using for loop
        for (int number : numbers) {
            System.out.println(number);
        }

        // Using while loop for odd indices
        System.out.println("числа тільки з непарним індексом");

        int k = 0;
        while (k < numbers.length) {
            if (k % 2 != 0) {
                System.out.println(numbers[k]);
            }
            k++;
        }

        // Using for loop for even indices
        System.out.println("числа тільки з парним індексом");

        for (int l = 0; l < numbers.length; l++) {
            if (l % 2 == 0) {
                System.out.println(numbers[l]);
            }
        }

        // Print the array in reverse order
        System.out.println("Mасив в зворотньому порядку.");

        for (int m = numbers.length - 1; m >= 0; m--) {
            System.out.println(numbers[m]);
        }
    }
    // Task 3
    public double sumArrayElements(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum;
    }

    // Task 4
    public int[] changeSignOfOdds(int[] array) {
        for (int n = 0; n < array.length; n++) {
            if (array[n] % 2 != 0) {
                array[n] *= -1;
            }
        }
        return array;
    }
}
