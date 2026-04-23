class NumberPrinter implements Runnable {
    private int start;
    private int end;
    private int interval; 
    private String threadName;
    
    public NumberPrinter(int start, int end, int interval, String threadName) {
        this.start = start;
        this.end = end;
        this.interval = interval;
        this.threadName = threadName;
    }
    
    public void run() {
        try {
            for (int i = start; i <= end; i++) {
                System.out.println(threadName + ": " + i);
                Thread.sleep(interval); 
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberPrinter(1, 10, 1000, "Thread-1"));
         
        Thread t2 = new Thread(new NumberPrinter(11, 20, 500, "Thread-2"));
        
        System.out.println("Starting both threads...");
        t1.start();
        t2.start();
        
        try {
            t1.join(); 
            t2.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("Both threads completed.");
    }
}
