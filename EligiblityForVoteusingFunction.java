import java.util.Scanner;

public class EligiblityForVoteusingFunction {
    public static void main(String[] args){
        int age = 0;
        Eligiblity(age);
    }

    static void Eligiblity(int age){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = input.nextInt();
        if(age>=18){
            System.out.print("You are Eligible for vote");
        }
        else{
            System.out.print("You are not Eligible for vote");
        }
    }
}
