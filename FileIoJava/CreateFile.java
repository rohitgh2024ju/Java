package FileIoJava;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("notes.txt");

        try {
            if(!file.exists()) {
                file.createNewFile();
                System.out.println("File is created.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file.getAbsolutePath());
    }
}
