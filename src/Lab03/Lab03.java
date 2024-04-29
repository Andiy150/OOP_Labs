package Lab03;

public class Lab03 {
    // Task 1
    public void printPhrase(String phrase) {
        // Using for loop
        for (int i = 0; i < 50; i++) {
            System.out.println(phrase);
        }

        // Using while loop
        int whileCount = 0;
        while (whileCount < 50) {
            System.out.println(phrase);
            whileCount++;
        }
    }

    // Task 2
    public void printTimeFor() {
        for (int hour = 0; hour <= 2; hour++) {
            for (int min = 0; min < 60; min++) {
                System.out.println(hour + " h " + min + " min");
            }
        }
    }

    // Task 3
    public void printTimeWhile() {
        int hour = 0;
        int min = 0;
        while (hour <= 2) {
            System.out.println(hour + " h " + min + " min");
            min++;
            if (min == 60) {
                min = 0;
                hour++;
            }
        }
    }

    // Task 4
    public void printTimeWithSeconds() {
        for (int hour = 0; hour <= 2; hour++) {
            for (int min = 0; min < 60; min++) {
                for (int sec = 0; sec < 60; sec++) {
                    System.out.println(hour + " h " + min + " min " + sec + " sec");
                }
            }
        }
    }

    // Task 5
    public void tabulateFunction() {
        double start = 0.0;
        double end = 2.0;
        double step = 0.1;

        System.out.println("Tabulating function with for loop:");
        for (double x = start; x <= end; x += step) {
            double y = calculateFunction(x);
            System.out.printf("f(%.1f) = %.4f%n", x, y);
        }

        System.out.println("Tabulating function with while loop:");
        double x = start;
        while (x <= end) {
            double y = calculateFunction(x);
            System.out.printf("f(%.1f) = %.4f%n", x, y);
            x += step;
        }
    }
    // The function to calculate
    private double calculateFunction(double x) {
        return x - 2 + Math.sin(1 / x);
    }
}