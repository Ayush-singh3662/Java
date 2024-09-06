import java.util.Scanner;

public class AreaofParallelogram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of parallelogram: ");
        int length = input.nextInt();
        System.out.print("Enter the breadth of parallelogram: ");
        int breadth = input.nextInt();
        int area = length * breadth;
        System.out.print("Area of parallelogram = "+area);
        input.close();
    }
}