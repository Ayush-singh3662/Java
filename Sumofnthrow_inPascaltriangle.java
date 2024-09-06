import java.util.Scanner;

public class Sumofnthrow_inPascaltriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row number : ");
        int n = input.nextInt();
        System.out.println(1<<(n-1));
    }
}
