import java.util.Scanner;

public class LargestNumberuntil0 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int max = 0;
        while(true){
            int num = input.nextInt();
            if(num == 0){
                break;
            }
            if(max<num){
                max = num;
            }
        }
        System.out.print("Largest number = "+max);
    }
}