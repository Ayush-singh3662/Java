import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal: ");
        float p = input.nextFloat();
        System.out.print("Enter rate of interest: ");
        int r = input.nextInt();
        System.out.print("Enter time: ");
        int t = input.nextInt();
        float si = (p*r*t)/100;
        System.out.println("Simple interest = "+si);
    }
}
