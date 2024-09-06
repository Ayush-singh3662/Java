import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any character: ");
        char ch = input.next().trim().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.print("Given Character is Vowel");
        }
        else{
            System.out.print("Given Character is Consonant");
        }
    }
}
