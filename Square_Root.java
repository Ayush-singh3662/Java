import java.util.Scanner;

public class Square_Root{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        System.out.println("Squareroot of number = "+squareroot(num));
    }
    static int squareroot(int num){
        int start = 0;
        int end = num;
        int mid = 0;
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        while(start<=end){
            mid = start + (end - start)/2;
            if(num/mid == mid){
                return mid;
            }
            else if(num/mid<mid){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}