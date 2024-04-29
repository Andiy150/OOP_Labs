import Lab01.*;
import Lab02.*;
import Lab03.*;
import Lab04.*;
import Lab05.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lab01 lab01 = new Lab01();
        System.out.println("Lab01");

        lab01.processTask1();
        lab01.processTask2();
        lab01.processTask3();
        lab01.processTask4();
        lab01.processTask5();

        System.out.println("\n\n");

        Lab02 lab = new Lab02();
        System.out.println("Lab02");

        lab.solveQuadraticEquation(1, -5, 6); // Task 1
        lab.determineQuadrant(1, -1); // Task 2
        lab.isTwoDigitAndEven(22); // Task 3
        lab.evaluateFunction(4); // Task 4
        lab.determineDayType(6); // Task 5

        System.out.println("\n\n");

        Lab03 lab03 = new Lab03();
        String phrase = "This is a phrase to be printed 50 times.";

        lab03.printPhrase(phrase);// Task 1
        lab03.printTimeFor();// Task 2
        lab03.printTimeWhile();// Task 3
        lab03.printTimeWithSeconds();// Task 4
        lab03.tabulateFunction();// Task 5

        System.out.println("\n\n");

        Lab04 lab04 = new Lab04();

        // Task 1
        int[] evenNumbers = lab04.fillArrayWithEvenNumbers();
        int[] oddNumbers = lab04.fillArrayWithOddNumbers();
        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
        System.out.println("Odd numbers: " + Arrays.toString(oddNumbers));

        // Task 2
        lab04.arrayOperations();

        // Task 3
        double[] realNumbers = {1.5, 2.3, -1.7, 4.1, 5.6};
        double sum = lab04.sumArrayElements(realNumbers);
        System.out.println("Sum of elements: " + sum);

        // Task 4
        int[] mixedNumbers = {1, 2, 3, 4, -5, -6, 7, 8, 9, -10};
        int[] modifiedNumbers = lab04.changeSignOfOdds(mixedNumbers);
        System.out.println("Modified numbers: " + Arrays.toString(modifiedNumbers));

        System.out.println("\n\n");

        Lab05 lab05 = new Lab05();

        // Task 1: Calculate the area of a trapezoid
        double area = lab05.calculateTrapezoidArea(5, 7, 3);
        System.out.println("Area of trapezoid: " + area);

        // Task 2: Find and return the smallest of three numbers
        double smallest = lab05.findSmallestNumber(3, 7, 1);
        System.out.println("The smallest number is: " + smallest);

        // Task 3: Print an array
        System.out.print("The array is: ");
        lab05.printArray(oddNumbers);

        // Task 4: Return the largest number from an array
        int largest = lab05.findLargestNumber(oddNumbers);
        System.out.println("The largest number in the array is: " + largest);

    }
}