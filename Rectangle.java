public class Rectangle {
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
