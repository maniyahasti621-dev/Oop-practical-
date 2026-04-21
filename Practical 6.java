public class Practical6{
    private double width = 1;
    private double height = 1;

    public Rectangle() {
    }
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
  
    public double getArea() {
        return width * height;
    }
  
    public double getPerimeter() {
        return 2 * (width + height);
    }

   
