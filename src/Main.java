import Lab01.*;
import Lab02.*;
import Lab03.*;

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
    }
}