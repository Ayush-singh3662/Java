import java.util.Scanner;

public class GreatestNumberInArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int max = 0, start = 0, end = 0;
        int[] arr = new int[5];
        System.out.print("Enter the elements of Arrays(only 5 elements): ");
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Greatest number in array = "+Maxval(arr));
        MaxvalAtInterval(arr, 0,3);
    }

    static int Maxval(int[] arr){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static void MaxvalAtInterval(int[] arr, int start, int end){
        int max = 0;
        for(int i=start; i<=end; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Greatest number between "+start+" & "+end+" are: "+max);
    }
}
