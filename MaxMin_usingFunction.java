import java.util.Scanner;

public class MaxMin_usingFunction{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = input.nextInt();
        System.out.println("Greatest number = "+max(num1,num2,num3));
        System.out.println("Smallest number = "+min(num1,num2,num3));
    }

    static int max(int num1, int num2, int num3){
        int max = 0;
        if(num1>max){
            max = num1;
        }
        if(num2>max){
            max = num2;
        }
        if(num3>max){
            max = num3;
        }
        return max;
    }

    static int min(int num1, int num2, int num3){
        int min = 1000000;
        if(num1<min){
            min = num1;
        }
        if(num2<min){
            min = num2;
        }
        if(num3<min){
            min = num3;
        }
        return min;
    }
}