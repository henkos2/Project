package tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import project.Files;

public class FilesTest {
    
    @Test
    public void testReader() {

        File tempFile = createTempFileWithContents("1 2 3\n4 5 6\n7 8 9");
        
        Files files = new Files();
        
        String result1 = files.reader(0);
        assertEquals("1 2 3", result1);
        
        String result2 = files.reader(1);
        assertEquals("4 5 6", result2);
        
        String result3 = files.reader(2);
        assertEquals("7 8 9", result3);

        tempFile.delete();
    }
    
    private File createTempFileWithContents(String contents) {
        try {
            File tempFile = File.createTempFile("temp", ".txt");
            FileWriter writer = new FileWriter(tempFile);
            writer.write(contents);
            writer.close();
            return tempFile;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

