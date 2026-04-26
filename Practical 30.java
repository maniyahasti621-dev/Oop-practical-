import java.util.HashMap;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        String[] words = sentence.trim().split("\\s+");
        
        HashMap<String, Integer> wordCount = new HashMap<>();
        
        for (String word : words) {
            if (word.isEmpty()) continue; 
            
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        System.out.println("Word frequencies:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + " -> " + wordCount.get(word));
        }
        
        sc.close();
    }
}
