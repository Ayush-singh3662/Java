import java.util.Scanner;

public class VolumeofCone {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of cone: ");
        float radius = input.nextFloat();
        System.out.print("Enter the height of cone: ");
        float height = input.nextFloat();
        float area = (float) (3.14 * radius * radius * height)/3;
        System.out.print("Area of cone = "+area);
    }
}
