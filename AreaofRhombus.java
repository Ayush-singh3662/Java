import java.util.Scanner;

public class AreaofRhombus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of 1st diagonal: ");
        int d1 = input.nextInt();
        System.out.print("Enter the length of 2nd diagonal: ");
        int d2 = input.nextInt();
        int area = (d1 * d2)/2;
        System.out.print("Area of rhombus = "+area);
    }
}
