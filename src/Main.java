import Lab01.*;
import Lab02.*;

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

    }
}