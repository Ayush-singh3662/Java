public class CheckAbstract {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        c.radius = 7.0;
        System.out.println(c.perimeter());
        System.out.println(c.area());
        
        Rectangle r = new Rectangle();
        r.length = 2.0;
        r.breadth = 3.0;
        System.out.println(r.perimeter());
        System.out.println(r.area());

        Shape s = c;
        System.out.println(s.area());
    }
}

abstract class Shape {
    abstract double perimeter();
    abstract double area();
}

class Circle1 extends Shape {
    double radius;
    // Circle(double radius) {
    //     this.radius = radius;
    // }
    double perimeter() {
        return 2*Math.PI*radius;
    }
    double area() {
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;
    // Rectangle(double length, double breadth) {
    //     this.length = length;
    //     this.breadth = breadth;
    // }
    double perimeter() {
        return 2*(length+breadth);
    }
    double area() {
        return length*breadth;
    }
}