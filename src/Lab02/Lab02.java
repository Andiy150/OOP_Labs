package Lab02;

public class Lab02 {
    // Task 1
    public void solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        double root1, root2;

        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different. Root1 = " + root1 + ", Root2 = " + root2);
        } else if (discriminant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.println("Roots are real and the same. Root = " + root1);
        } else { // discriminant < 0
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex. Root1 = " + realPart + "+" + imaginaryPart + "i , Root2 = " + realPart + "-" + imaginaryPart + "i");
        }
    }

    // Task 2
    public void determineQuadrant(double x, double y) {
        if (x > 0 && y > 0) {
            System.out.println("Point (" + x + ", " + y + ") is in the first quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("Point (" + x + ", " + y + ") is in the second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("Point (" + x + ", " + y + ") is in the third quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("Point (" + x + ", " + y + ") is in the fourth quadrant.");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is at the origin or on one of the axes.");
        }
    }

    // Task 3
    public void isTwoDigitAndEven(int number) {
        boolean isTwoDigit = number >= 10 && number <= 99 || number <= -10 && number >= -99;
        boolean isEven = number % 2 == 0;

        if (isTwoDigit && isEven) {
            System.out.println("The number " + number + " is two-digit and even.");
        } else {
            System.out.println("The number " + number + " is not two-digit and even.");
        }
    }
    // Task 4
    public void evaluateFunction(int x) {
        if (x < 0) {
            System.out.println(Math.pow(x, 2) + 3);
        } else if (x <= 5) {
            System.out.println(6 * Math.sqrt(x));
        } else { // x > 5
            System.out.println(-x + 9);
        }
    }
    // Task 5
    public void determineDayType(int day) {
        switch (day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("It's a weekday.");
                break;
            case 6: case 7:
                System.out.println("It's a weekend.");
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }
    }
}
