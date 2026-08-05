package FileIoJava;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File practiceFolder = new File("chap1practice");
   
        File[] files = practiceFolder.listFiles();
        for (File file : files) {
            System.out.println(file + " > " + file.getAbsolutePath() + " > " + file.length() + " bytes.");
        }
    }
}
