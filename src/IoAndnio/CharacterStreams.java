package IoAndnio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharacterStreams {
    private final static File readingFile = new File("/mnt/hdd/Idea/CoreJava/names.txt");
    private final static File writeTo = new File("/mnt/hdd/Idea/CoreJava/write.txt");

    public static void readAFile() throws IOException {
        FileReader reader = new FileReader(readingFile);
        int charReader;
        while ((charReader = reader.read()) != -1){
            System.out.print((char) charReader);
        }
        reader.close();
    }
}
