public class TaskISP {

    static double size = 10;
    public static void main(String[] args) {

        Circle circle = new Circle(size);
        Cube cube = new Cube(size);

        System.out.println("Площадь круга с радиусом " + size + " = " + circle.area());
        System.out.println("Объём куба " + size + " = " + cube.volume());
    }
}

// interface for shapes without volume
interface Shape {
    double area();
}

// interface for volume shapes 
interface VolumeShape {
    double volume();
}

// implements interface for non-volume shapes and calculate the shape area
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}

// implements interface for volume shapes and calculate the volume of shape
class Cube implements Shape,VolumeShape {
    private double edge;

    public Cube(double size) {
        this.edge = size;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}

