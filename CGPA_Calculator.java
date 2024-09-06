import java.util.Scanner;

public class CGPA_Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = input.nextInt();
        int grade, sum = 0;
        float marks = 0;
        for(int i = 1; i<=n; i++){
            System.out.print("Enter marks of subject "+i+": ");
            marks = input.nextFloat();
        if(marks<33){
            grade = 0;
        }
        else if(marks<=40 && marks>=33){
            grade = 4;
        }
        else if(marks<=50 && marks>=41){
            grade = 5;
        }
        else if(marks<=60 && marks>=51){
            grade = 6;
        }
        else if(marks<=70 && marks>=61){
            grade = 7;
        }
        else if(marks<=80 && marks>=71){
            grade = 8;
        }
        else if(marks<=90 && marks>=81){
            grade = 9;
        }
        else{
            grade = 10;
        }
        sum = sum + grade;
        }
        System.out.print("CGPA = "+(sum/n));
    }
}
