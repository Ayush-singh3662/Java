import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Total no. of runs scored: ");
        long runs = input.nextLong();
        System.out.print("Enter no. of matches: ");
        long matches = input.nextLong();
        System.out.print("Enter no. of matches being notout: ");
        long notout = input.nextLong();
        long avg;
        if(matches == notout){
            avg = runs;
        }
        else{
            avg = runs/(matches-notout);
        }
        System.out.print("Batting Average = "+avg); 
    }
}
