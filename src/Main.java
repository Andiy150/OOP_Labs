import Lab01.*;
import Lab02.*;
import Lab03.*;
import Lab04.*;
import Lab05.*;
import Lab06.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Виберіть лабораторну роботу (або напишіть 'exit' щоб вийти):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                switch (number) {
                    case 1:
                        Lab01 lab01 = new Lab01();
                        System.out.println("Lab01");

                        lab01.processTask1();
                        lab01.processTask2();
                        lab01.processTask3();
                        lab01.processTask4();
                        lab01.processTask5();

                        System.out.println("\n\n");
                        break;
                    case 2:
                        Lab02 lab = new Lab02();
                        System.out.println("Lab02");

                        lab.solveQuadraticEquation(1, -5, 6); // Task 1
                        lab.determineQuadrant(1, -1); // Task 2
                        lab.isTwoDigitAndEven(22); // Task 3
                        double result = lab.evaluateFunction(4.3); // Task 4
                        System.out.println("f(" + 4.3 + ") = " + result);
                        lab.printDaysInMonth(6); // Task 5

                        System.out.println("\n\n");
                        break;
                    case 3:
                        Lab03 lab03 = new Lab03();
                        String phrase = "This is a phrase to be printed 50 times.";

                        lab03.printPhrase(phrase);// Task 1
                        lab03.printTimeFor();// Task 2
                        lab03.printTimeWhile();// Task 3
                        lab03.printTimeWithSeconds();// Task 4
                        lab03.tabulateFunction();// Task 5

                        System.out.println("\n\n");
                        break;
                    case 4:
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
                        break;
                    case 5:
                        Lab05 lab05 = new Lab05();
                        int[] Numbers = {1, 2, 3, 4, -5, -6, 7, 8, 9, -10};

                        // Task 1
                        double area = lab05.calculateParallelogramArea(5, 7);
                        System.out.println("Area of trapezoid: " + area);

                        // Task 2
                        double smallest = lab05.findSmallestNumber(3, 7, 1);
                        System.out.println("The smallest number is: " + smallest);

                        // Task 3
                        System.out.print("The array is: ");
                        lab05.printArray(Numbers);

                        // Task 4
                        int largest = lab05.findLargestNumber(Numbers);
                        System.out.println("The largest number in the array is: " + largest);
                        break;
                    case 6:
                        // Lab 6
                        Lab06 lab06 = new Lab06();
                        lab06.Task1();
                        lab06.Task2();
                        lab06.Task4();
                        lab06.Task5();
                        break;
                    case 7:
                        System.out.println("You entered three.");
                        break;
                    case 8:
                        System.out.println("You entered three.");
                        break;
                    default:
                        System.out.println("You entered a number other than 1, 2, or 3.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }

        scanner.close(); // Close the scanner
    }
}