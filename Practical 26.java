import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCounter {
    public static void main(String[] args) {
        if (args.length!= 1) {
            System.out.println("Usage: java FileCounter <filename>");
            return;
        }

        String fileName = args[0];
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine())!= null) {
                lineCount++;
                charCount += line.length();
              
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }

            if (lineCount > 0) {
                charCount += lineCount; 
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("File: " + fileName);
        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Characters: " + charCount);
    }
}
