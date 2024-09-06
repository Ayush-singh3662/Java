import java.util.Scanner;

public class Case_Checker{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any alphabet: ");
        char ch = input.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.print("Lower case alphabet");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.print("Upper case alphabet");
        }
        else{
            System.out.print("Invalid Credentials");
        }
    }
}