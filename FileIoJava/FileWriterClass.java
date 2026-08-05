package FileIoJava;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class FileWriterClass {
    public static void main(String[] args) {
        try {

            File file = new File("student.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            try (FileWriter writer = new FileWriter(file, true)) {

                writer.write("Name : Rohit Saha\n");
                writer.write("Age : 21\n");
                writer.write("University : Jadavpur University\n");
                writer.write("Department : Mechanical Engineering\n");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
