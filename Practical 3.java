import java.util.Scanner;

public class Practical3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single letter: ");
        char ch = sc.next().charAt(0);

        // Convert to lowercase for case-insensitive check
        char lowerCh = Character.toLowerCase(ch);

        // Check if it's a letter first
        if (Character.isLetter(lowerCh)) {
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is a consonant");
           
