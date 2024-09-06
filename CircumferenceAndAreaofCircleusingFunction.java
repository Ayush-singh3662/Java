import java.util.Scanner;

public class CircumferenceAndAreaofCircleusingFunction {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int rad = input.nextInt();
        System.out.println("Circumference of circle = "+CircumferenceOfCircle(rad));
        System.out.println("Area of Circle = "+AreaOfCircle(rad));
    }

    static double CircumferenceOfCircle(int rad){
        double circumference = 2 * 3.14 * rad;
        return circumference;
    }

    static double AreaOfCircle(int rad){
        double area = 3.14 * rad * rad;
        return area;
    }
}