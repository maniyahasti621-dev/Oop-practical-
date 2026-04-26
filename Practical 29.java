import java.util.ArrayList;
import java.util.Collections;

public class MarksManager {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        
        marks.add(85);
        marks.add(92);
        marks.add(67);
        marks.add(78);
        marks.add(95);
        marks.add(73); 
        
        System.out.println("--- Student Marks ---");
        for (int i = 0; i < marks.size(); i++) {
            System.out.println("Student " + (i + 1) + ": " + marks.get(i));
        }
      
        
        if (!marks.isEmpty()) {
            int highest = Collections.max(marks);
            int lowest = Collections.min(marks);
            
            System.out.println("\nHighest Mark: " + highest);
            System.out.println("Lowest Mark: " + lowest);
        } else {
            System.out.println("No marks available.");
        }
        
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.size();
        System.out.printf("Average Mark: %.2f\n", average);
    }
}
