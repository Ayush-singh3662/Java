import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of triangle: ");
        int height = input.nextInt();
        System.out.print("Enter the base of triangle: ");
        int base = input.nextInt();
        int area = (height * base)/2;
        System.out.println("Area of Triangle = "+area);
    }
}