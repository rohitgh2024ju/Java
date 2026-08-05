package FileIoJava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterClass {

    public static void main(String[] args) throws IOException {

        File file = new File("report.txt");

        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File : " + file.getName() + " is created.");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            writer.write("Name : Rohit Saha");
            writer.newLine();
            writer.flush();
            
            writer.write("Marks : 95");
            writer.newLine();
            writer.flush();
            
            writer.write("Grade : A+");
            writer.newLine();
            writer.flush();
            
            writer.write("----------------");
            writer.newLine();
            writer.flush();
            
            writer.write("Status : Passed");
            writer.newLine();
            writer.flush();
        }

        System.out.println("Data written successfully.");
    }
}