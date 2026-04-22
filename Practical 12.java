public class VolumeCalculator {
    
    public double calculateVolume(double side) {
        return side * side * side;
    }

    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public double calculateVolume(double radius, String shape) {
        if (shape.equalsIgnoreCase("sphere")) {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        }
        return 0; 
    }

    public static void main(String[] args) {
        VolumeCalculator vc = new VolumeCalculator();

        double cubeSide = 5;
        double cubeVol = vc.calculateVolume(cubeSide);
        System.out.println("Cube with side " + cubeSide + ":");
        System.out.printf("Volume = %.2f\n\n", cubeVol);

        double length = 4, width = 3, height = 6;
        double rectVol = vc.calculateVolume(length, width, height);
        System.out.println("Rectangular Cube " + length + " x " + width + " x " + height + ":");
        System.out.printf("Volume = %.2f\n\n", rectVol);

        double radius = 3;
        double sphereVol = vc.calculateVolume(radius, "sphere");
        System.out.println("Sphere with radius " + radius + ":");
        System.out.printf("Volume = %.2f\n", sphereVol);
    }
}
