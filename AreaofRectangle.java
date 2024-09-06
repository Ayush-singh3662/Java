import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        int length = input.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        int breadth = input.nextInt();
        int area = length*breadth;
        System.out.print("Area of Rectangle = "+area);
        input.close();
    }
}
