class Shape {
    protected double d1;
    protected double d2;
    public void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    public double calculateArea() {
        return 0.5 * d1 * d2;
    }

    public void displayArea() {
        System.out.println("Triangle dimensions: base = " + d1 + ", height = " + d2);
        System.out.printf("Area of Triangle = %.2f\n", calculateArea());
    }
}

class Rectangle extends Shape {
    public double calculateArea() {
        return d1 * d2;
    }

    public void displayArea() {
        System.out.println("Rectangle dimensions: length = " + d1 + ", width = " + d2);
        System.out.printf("Area of Rectangle = %.2f\n", calculateArea());
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Triangle tri = new Triangle();
        tri.getData(10, 6); 
        tri.displayArea();

        System.out.println();
        Rectangle rect = new Rectangle();
        rect.getData(8, 5); 
        rect.displayArea();
    }
}
