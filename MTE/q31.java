interface Shape{
    double getArea();
}
class Rectangle implements Shape{
private double length;
private double width;
public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
@Override
public double getArea(){
        return length * width;
    }
}
class Circle implements Shape{
private double radius;
public Circle(double radius){
        this.radius = radius;
    }
@Override
public double getArea(){
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape{
 private double base;
 private double height;
 public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
@Override    
public double getArea(){
        return (base * height) / 2;
    }
}

public class q31 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 5.0);
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(8.0, 6.0);

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Triangle area: " + triangle.getArea());
    }
}