import java.util.LinkedList;

public class GenericSearch {
    
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }
    
    public static void main(String[] args) {
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(105);
        rollNumbers.add(110);
        rollNumbers.add(115);
        
        System.out.println("--- Testing with Integer LinkedList ---");
        System.out.println("Roll Numbers: " + rollNumbers);
        
        int searchRoll1 = 105;
        int searchRoll2 = 120;
        System.out.println("Search " + searchRoll1 + ": " + searchElement(rollNumbers, searchRoll1));
        System.out.println("Search " + searchRoll2 + ": " + searchElement(rollNumbers, searchRoll2));
        
        LinkedList<String> names = new LinkedList<>();
        names.add("Aman");
        names.add("Riya");
        names.add("Karan");
        names.add("Neha");
        
        System.out.println("\n--- Testing with String LinkedList ---");
        System.out.println("Names: " + names);
        
        String searchName1 = "Riya";
        String searchName2 = "Vikas";
        System.out.println("Search \"" + searchName1 + "\": " + searchElement(names, searchName1));
        System.out.println("Search \"" + searchName2 + "\": " + searchElement(names, searchName2));
    }
}
