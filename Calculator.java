import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.print("Enter 1st number: ");
            int num1 = input.nextInt();
            System.out.print("Enter 2nd number: ");
            int num2 = input.nextInt();
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op =='/'){
                    if(num2 != 0){
                        ans = num1/num2;
                    }
                }
                if(op == '%'){
                    ans = num1%num2;
                }
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid operation");
            }
            System.out.println("Answer = "+ans);
        }
    }
}