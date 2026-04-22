public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1:");
        System.out.println("Width = " + r1.getWidth());
        System.out.println("Height = " + r1.getHeight());
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.println("Width = " + r2.getWidth());
        System.out.println("Height = " + r2.getHeight());
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());

        System.out.println();

        double area1 = r1.getArea();
        double area2 = r2.getArea();

        if (area1 > area2) {
            System.out.println("Rectangle 1 has a larger area: " + area1);
        } else if (area2 > area1) {
            System.out.println("Rectangle 2 has a larger area: " + area2);
        } else {
            System.out.println("Both rectangles have the same area: " + area1);
        }
    }
}
