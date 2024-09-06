import java.util.Scanner;

public class PrimenumbersBetween2NumbersUsingFunctions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Lower Value: ");
        int num1 = input.nextInt();
        System.out.print("Enter Upper Value: ");
        int num2 = input.nextInt();
        Prime(num1, num2);
    }

    static void Prime(int num1, int num2){
        int i, j;
        for(i = num1; i<=num2; i++){
            for(j=2; j<i; j++){
                if(i%j==0){
                    break;
                }
                }
                if(i == j){
                    System.out.print(i +" ");
            }
        }
    }
}