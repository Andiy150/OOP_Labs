package Lab08;

import java.util.Scanner;

public class Lab08 {
    public void Task1(){
        Scanner scanner = new Scanner(System.in);

        // Get filename from the user
        System.out.print("Enter filename to create and write random numbers: ");
        String filename = scanner.nextLine();

        // Get the number of random numbers to generate
        System.out.print("Enter the number of random numbers to generate: ");
        int count = scanner.nextInt();

        // Get the range of random numbers
        System.out.print("Enter the minimum number (b1): ");
        int b1 = scanner.nextInt();
        System.out.print("Enter the maximum number (b2): ");
        int b2 = scanner.nextInt();

        Writer writer = new Writer();
        writer.Write(filename, count, b1, b2);

        Reader reader = new Reader();
        reader.Read(filename);

        scanner.close();
    }
}
