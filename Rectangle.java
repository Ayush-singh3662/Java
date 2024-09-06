public class Rectangle {
    public static void main(String[] args) {
        Ayush rectangle = new Ayush();
        rectangle.setLength(10.5);
        rectangle.setBreadth(5.5);
        System.out.println(rectangle.Perimeter());
        System.out.println(rectangle.Area());
        System.out.println(rectangle.isSquare());

        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getBreadth());
    }
}

class Ayush {
    private double length;
    private double breadth;
    public void setLength(double l) {
        if(l < 0) {
            length = 0;
        }
        else {
            length = l;
        }
    }
    public double getLength() {
        return length;
    }
    public void setBreadth(double b) {
        if(b < 0) {
            breadth = 0;
        }
        else {
            breadth = b;
        }
    }
    public double getBreadth() {
        return breadth;
    }
    public double Area() {
        return length * breadth;
    }
    public double Perimeter() {
        return 2*(length + breadth);
    }
    public boolean isSquare() {
        return length == breadth;
    }
}
