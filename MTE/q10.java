public class q10 {

    private double radius;

    // Constructor to initialize the radius
    public q10(double radius) {
        this.radius = radius;
    }

    // Getter method to access the radius
    public double getRadius() {
        return radius;
    }

    // Setter method to modify the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter of the circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Create a Circle object with radius 5
        q10 circle = new q10(5);

        // Access the radius using the getter method
        double radius = circle.getRadius();
        System.out.println("Radius: " + radius);

        // Modify the radius using the setter method
        circle.setRadius(10);

        // Calculate and print the area and perimeter

        
double area = circle.calculateArea();
        double perimeter = circle.calculatePerimeter();
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}