import java.util.Scanner;

public class Power {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        double a = input.nextDouble();
        System.out.print("Enter power: ");
        double b = input.nextDouble();
        float c = (float) Math.pow(a,b);
        System.out.print("Answer = "+c);
    }
}