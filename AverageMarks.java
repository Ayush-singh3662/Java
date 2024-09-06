import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = input.nextInt();
        float marks, sum = 0;
        for(int i = 1; i<=n; i++){
            System.out.print("Enter marks of subject "+i+": ");
            marks = input.nextFloat();
            sum = sum + marks;
        }
        System.out.print("Average = "+(sum/n));
    }
}