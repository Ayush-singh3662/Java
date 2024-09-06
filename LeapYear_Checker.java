import java.util.Scanner;

public class LeapYear_Checker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any year: ");
        int year = input.nextInt();
        if(year%4 == 0){
            System.out.print("Given year is a Leap year");
        }
        else{
            System.out.print("Given number is not Leap year");
        }
    }
}
