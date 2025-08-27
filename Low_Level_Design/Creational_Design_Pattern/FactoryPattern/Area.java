package Low_Level_Design.Creational_Design_Pattern.FactoryPattern;

public class Area {
    public static void main(String[] args) {
        // Calculate Area for Circle;
        // String val = "Circle";
        Shape shape = null;
        // if (val.equals("Circle")) {
        //     shape = new Circle(5);
        // } else if (val.equals("Rectangle")) {
        //     shape = new Rectange(4, 5);
        // }
        // if (shape != null) {
        //     System.out.println("Area: " + shape.calculateArea());
        // } else {
        //     System.out.println("Invalid shape type");
        // }
        // // Calculate Area for Rectangle
        // val = "Rectangle";
        // if (val.equals("Circle")) {
        //     shape = new Circle(5);
        // } else if (val.equals("Rectangle")) {
        //     shape = new Rectange(4, 5);
        // }   
        // if (shape != null) {
        //     System.out.println("Area: " + shape.calculateArea());
        // } else {
        //     System.out.println("Invalid shape type");
        // }

        // Using Factory Design Pattern
        // now we can focus on the logic of calculating area
        // shape = ShapeFactory.getShape(val, 5);
        // or
        shape = new CircleFactory().createShape(5);
        if (shape != null) {
            System.out.println("Area: " + shape.calculateArea());
        } else {
            System.out.println("Invalid shape type");
        }

    }
    // as we can see // we are using if-else statements to create objects of Circle and Rectangle
    // this is not a good design pattern as it violates Open/Closed Principle
    // we can use Factory Design Pattern to create objects of Circle and Rectangle
    // we can create a ShapeFactory class that will return the object of Circle or Rectangle based on the input
    // this will make the code more maintainable and extensible
    //
}
class ShapeFactory {
    // Factory method to create shapes
    // This method will take the shape type and dimensions as input and return the object of Circle
    public static Shape getShape(String shapeType, double... dimensions) {
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle(dimensions[0]);
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectange(dimensions[0], dimensions[1]);
        }
        return null; // or throw an exception
    }
}
// create using factory method
abstract class ShapeFactory2 {
    public abstract Shape createShape();
}
class CircleFactory extends ShapeFactory {
    public Shape createShape(int val) {
        return new Circle(val); // Example radius
    }
}
interface Shape {
    public double calculateArea();
}
class Circle implements Shape {
    private double a; // radius
    public Circle(double a) {
        this.a = a;
    }
    public double calculateArea(){
        return 3.14*a*a;
    }
}
class Rectange implements Shape {
    private double l;
    private double b;
    public Rectange(double l, double b) {
        this.l = l;
        this.b = b;
    }
    public double calculateArea(){
        return l*b;
    }
}