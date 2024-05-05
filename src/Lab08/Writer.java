package Lab08;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Writer {
    public void Write(String filename, int count, int b1, int b2) {
        File file = new File(filename);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
            return;
        }

        try (FileWriter writer = new FileWriter(file, false)) {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                int randomNum = random.nextInt(b2 - b1 + 1) + b1;
                writer.write(randomNum + (i < count - 1 ? "\n" : ""));
            }
            System.out.println("Random numbers written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
