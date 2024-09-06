import java.util.Scanner;

public class AreaofCircle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = input.nextFloat();
        float area = (float) (3.14*radius*radius);
        System.out.print("Area of circle: "+area);
        input.close();
    }
}