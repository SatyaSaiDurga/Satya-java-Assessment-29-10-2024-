import java.util.Scanner;
public class Main {
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

    }
}



