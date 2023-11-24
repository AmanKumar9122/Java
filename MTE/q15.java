public class q15 {

    private double radius;

    // No-arg constructor to set the default radius to 1
    public q15() {
        this.radius = 1.0;
    }

    // Parameterized constructor to initialize the radius
    public q15(double radius) {
        this.radius = radius;
    }

    // Getter method to access the radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return 3.14 * radius * radius;
    }
    public static void main(String[] args) {
        q15 circle = new q15();
        System.out.println(circle.getArea());
        q15 circle1 = new q15(3.0);
         System.out.println(circle1.getArea());
        q15 circle2 = new q15(3.2);
         System.out.println(circle2.getArea());
        q15 circle3 = new q15(4.1);
         System.out.println(circle3.getArea());
    }
}