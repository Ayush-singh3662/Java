import java.util.Scanner;

public class Temp_Conversion{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temprature in celcius: ");
        float cel = input.nextFloat();
        float far = cel * 9/5 +32;
        System.out.print("Temprature in farenheit = "+far);
    }
}