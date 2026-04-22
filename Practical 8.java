class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 5;
        this.y = 5;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.print("Default constructor -> ");
        p1.display();

        Point p2 = new Point(10, 20);
        System.out.print("Parameterized constructor -> ");
        p2.display();
      
        Point p3 = new Point(p2);
        System.out.print("Copy constructor -> ");
        p3.display();

        System.out.println("\nTesting if copy is independent:");
        Point p4 = new Point(7, 8);
        Point p5 = new Point(p4);
        System.out.print("Original: ");
        p4.display();
        System.out.print("Copy: ");
        p5.display();
    }
}
