import java.util.Scanner;

public class HCF {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        int hcf = 0, rem;
        if(num1>num2){
            if(num1%num2 == 0){
                hcf = num2;
            }
            else{
                while(num1%num2!=0){
                    rem = num1%num2;
                     num1 = num2;
                     num2 = rem;
                }
                hcf = num2;
            }
        }
        if(num2>num1){
            if(num2%num1 == 0){
                hcf = num1;
            }
            else{
                while(num2%num1!=0){
                    rem = num2%num1;
                    num2 = num1;
                    num1 = rem;
                }
                hcf = num1;
            }
        }
        System.out.print("HCF = "+hcf);
    }
}