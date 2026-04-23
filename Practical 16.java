interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Not First Division"; 
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Result r = new Result();
        
        double avg1 = 75.5;
        double avg2 = 58.0;
        
        System.out.println("Average " + avg1 + ": " + r.getDivision(avg1)); 
        System.out.println("Average " + avg2 + ": " + r.getDivision(avg2));
    }
}
