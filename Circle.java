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

