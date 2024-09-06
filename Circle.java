public class Circle {
    public static void main(String[] args) {
        Circle_Dimension circle = new Circle_Dimension();
        circle.radius = 2.3f;
        System.out.println(circle.perimeter());
        System.out.println(circle.area());
    }
}

class Circle_Dimension {
    float radius;
    public float perimeter() {
        return (float) (2 * Math.PI * radius);
    }
    public float area() {
        return (float) (Math.PI * radius * radius);
    }
}
