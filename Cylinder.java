public class Cylinder {
    public static void main(String[] args) {
        Cylinder_Test c = new Cylinder_Test();
        System.out.println(c.lidArea());
        System.out.println(c.TSA());
        System.out.println(c.volume());

        Cylinder_Test c1 = new Cylinder_Test(7.0);
        System.out.println(c1.lidArea());
        System.out.println(c1.TSA());
        System.out.println(c1.volume());

        Cylinder_Test c2 = new Cylinder_Test(7.0, 14.0);
        System.out.println(c2.lidArea());
        System.out.println(c2.TSA());
        System.out.println(c2.volume());
    }
}

class Cylinder_Test {
    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return height;
    }
    public void setRadius(double r) {
        radius = r;
    }
    public void setheight(double h) {
        height = h;
    }

    public Cylinder_Test() {
        radius = 1;
        height = 1;
    }
    public Cylinder_Test(double d) {
        radius = height = d;
    }
    public Cylinder_Test(double r, double h) {
        radius = r;
        height = h;
    }

    public double lidArea() {
        return Math.PI * radius * radius;
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }
    public double TSA() {
        return 2 * lidArea() + circumference() * height;
    }
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}