class TablePrinter {
    public synchronized void printTable(int num) {
        System.out.println("\n--- Table of " + num + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("--- End of Table " + num + " ---\n");
    }
}

class TableThread extends Thread {
    private TablePrinter printer;
    private int number;
    
    public TableThread(TablePrinter printer, int number) {
        this.printer = printer;
        this.number = number;
    }
    
    public void run() {
        printer.printTable(number);
    }
}

public class Main {
    public static void main(String[] args) {
        TablePrinter printer = new TablePrinter();
        
        Thread t1 = new TableThread(printer, 5);
        Thread t2 = new TableThread(printer, 7);
        
        System.out.println("Starting threads...");
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Both tables printed successfully.");
    }
}
