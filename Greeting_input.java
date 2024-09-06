import java.util.Scanner;

public class Greeting_input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any name: ");
        String name = input.next();
        System.out.println("Have a nice day "+name);
    }
}
