package FileIoJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class BufferReaderClass {

    public static void main(String[] args) throws IOException {

        File file = new File("marks.txt");

        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File created.");
        }

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("Rohit,85" + System.lineSeparator());
            fileWriter.write("Amit,85" + System.lineSeparator());
            fileWriter.write("Priya,85" + System.lineSeparator());
            fileWriter.write("Ankit,85" + System.lineSeparator());
            fileWriter.write("Sneha,85" + System.lineSeparator());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }

    }
}