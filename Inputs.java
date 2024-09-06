import java.util.Scanner;

public class Inputs{
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input1.nextLine();
        System.out.println("Name = "+name);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input2.nextInt();
        System.out.println("Age = "+age);
        System.out.print("Enter your marks: ");
        float marks = input2.nextFloat();
        System.out.println("Marks = "+marks);
    }
}
