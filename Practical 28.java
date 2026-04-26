import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataFileAnalyzer {
    public static void main(String[] args) {
        String fileName = "data.txt";
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (!Character.isWhitespace(ch)) {
                        charCount++;
                    }
                }
            }

            System.out.println("File: " + fileName);
            System.out.println("Total number of lines: " + lineCount);
            System.out.println("Total number of words: " + wordCount);
            System.out.println("Total characters (excluding spaces & newlines): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File '" + fileName + "' not found.");
            System.out.println("Make sure the file exists in the current directory.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                  br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
