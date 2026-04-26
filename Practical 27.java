import java.io.*;

public class StudentFileHandler {
    public static void main(String[] args) {
        String fileName = "students.txt";

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(fileName));

            bw.write("101,Riya Patel,85");
            bw.newLine();
            bw.write("102,Aman Shah,90");
            bw.newLine();
            bw.write("103,Neha Gupta,78");
            bw.newLine();

            System.out.println("Student records written to " + fileName + " successfully.");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            try {
                if (bw!= null) {
                    bw.close(); 
                }
            } catch (IOException e) {
                System.out.println("Error closing writer: " + e.getMessage());
            }
        }

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            String line;

            System.out.println("\n--- Student Records ---");
            System.out.println("RollNo\tName\t\tMarks");
            System.out.println("-----------------------------");

            while ((line = br.readLine())!= null) {
                String[] data = line.split(","); 
                if (data.length == 3) {
                    System.out.println(data[0] + "\t" + data[1] + "\t" + data[2]);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (br!= null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}
