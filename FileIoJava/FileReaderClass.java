package FileIoJava;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) {
        int charCount = 0;
        int spaceCount = 0;
        int newlineCount = 0;
        try (FileReader fileReader = new FileReader("student.txt")) {

            int ch = fileReader.read();

            while (ch != -1) {
                char c = (char) ch;

                if (c == '\n') {
                    newlineCount++;
                } else if (c == ' ') {
                    spaceCount++;
                } else {
                    charCount++;
                }

                System.out.print(c);
                ch = fileReader.read();
            }

            System.out.println("Character Count: " + charCount);
            System.out.println("Space Count: " + spaceCount);
            System.out.println("Lines Count: " + newlineCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}