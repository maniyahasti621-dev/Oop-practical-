class SequentialPrinter implements Runnable {
    private static final Object lock = new Object();
    private static int turn = 1; 
    
    private int start, end;
    private int threadId;
    
    public SequentialPrinter(int start, int end, int threadId) {
        this.start = start;
        this.end = end;
        this.threadId = threadId;
    }
    
    public void run() {
        for (int i = start; i <= end; i++) {
            synchronized (lock) {
                while (turn != threadId) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                
                System.out.println("T" + threadId + ": " + i);
                
                if (i == end) {
                    turn = threadId + 1; 
                }
                if (turn > 3) turn = 1; 
                
                lock.notifyAll(); 
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new SequentialPrinter(1, 100, 1), "T1");
        Thread t2 = new Thread(new SequentialPrinter(101, 200, 2), "T2");
        Thread t3 = new Thread(new SequentialPrinter(201, 300, 3), "T3");
        
        System.out.println("Starting threads...");
        t1.start();
        t2.start();
        t3.start();
        
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("All numbers printed sequentially.");
    }
}
