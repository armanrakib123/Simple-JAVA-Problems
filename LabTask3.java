//Create a base class Shape that has an abstract method calculateArea() which will be implemented by subclasses to calculate
//the area of different shapes. Then, create two subclasses: Rectangle and Circle and also make sure that these 2 classes can not be extended furthermore.
//The Rectangle class should have instance variables length and width and implement calculateArea() to return length * width.
//The Circle class should have an instance variable radius and implement calculateArea() to return π * radius * radius.
//In the main method, create objects of both Rectangle and Circle, initialize their dimensions, and call calculateArea() to display their respective areas.


abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class LabTask3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        Circle circle = new Circle(3);
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}
