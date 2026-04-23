class VotingApp {
    public void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Age: " + age + " -> Eligible to vote");
        }
    }
    
    public static void main(String[] args) {
        VotingApp app = new VotingApp();
        int[] testAges = {25, 16, 18, -5}; 
        
        for (int age : testAges) {
            try {
                System.out.println("\nChecking eligibility for age: " + age);
                app.checkEligibility(age);
            } catch (IllegalArgumentException e) {
                System.out.println("Exception caught: " + e.getMessage());
            } finally {
                System.out.println("Validation process completed");
            }
        }
    }
}
