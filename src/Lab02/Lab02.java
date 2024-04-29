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
    public double evaluateFunction(double x) {
        if (x <= -0.7) {
            return Math.pow(Math.sin(x), 2) - Math.pow(Math.cos(1 + Math.pow(x, 2)), 1/3.0);
        } else if (x > -0.7 && x <= 1.7) {
            return logBase3(Math.abs(Math.cos(Math.pow(x, 2) + 1)));
        } else { // x > 1.7
            return Math.pow(Math.E, 3 + x);
        }
    }

    private double logBase3(double value) {
        return Math.log(value) / Math.log(3);
    }
    // Task 5
    public void printDaysInMonth(int monthNumber) {
        switch (monthNumber) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 or 29 days (29 in a leap year)");
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                break;
        }
    }
}
