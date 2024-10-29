import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
    String getName();
}

class Rectangle implements Shape {
    public double height; 
    public double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double area() {
        return height * width;
    }

    public double perimeter() {
        return 2 * (height + width);
    }

    public String getName() {
        return "Rectangle";
    }
}

class Circle implements Shape {
    public double radius;
    public final double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return pi * radius * radius;
    }

    public double perimeter() {
        return 2 * pi * radius;
    }

    public String getName() {
        return "Circle";
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose a shape (circle/rectangle) or type 'exit' to quit:");
            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("exit")) {
                break;
            }

            Shape shape = null;

            if (choice.equals("circle")) {
                System.out.print("Enter the radius: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
            } else if (choice.equals("rectangle")) {
                System.out.print("Enter the height: ");
                double height = scanner.nextDouble();
                System.out.print("Enter the width: ");
                double width = scanner.nextDouble();
                shape = new Rectangle(height, width);
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.println("Shape: " + shape.getName());
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
            scanner.nextLine(); // Consume the newline character
        }
        scanner.close();
        System.out.println("Goodbye!");
    }
}

