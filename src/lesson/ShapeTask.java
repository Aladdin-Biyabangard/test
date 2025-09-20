package lesson;

interface Shape {
    double area();

    double perimeter();
}

class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}

class Rectangle implements Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}

public class ShapeTask {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("lesson.Circle sahəsi: " + circle.area());
        System.out.println("lesson.Circle perimetri: " + circle.perimeter());
        System.out.println("lesson.Rectangle sahəsi: " + rectangle.area());
        System.out.println("lesson.Rectangle perimetri: " + rectangle.perimeter());
    }
}
