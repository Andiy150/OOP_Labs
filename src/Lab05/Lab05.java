package Lab05;

public class Lab05 {
    // Task 1
    public double calculateTrapezoidArea(double base1, double base2, double height) {
        return (base1 + base2) * height / 2.0;
    }

    // Task 2
    public double findSmallestNumber(double num1, double num2, double num3) {
        double smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        return smallest;
    }

    // Task 3
    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Task 4
    public int findLargestNumber(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
