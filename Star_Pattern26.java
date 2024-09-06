import java.util.Scanner;

public class Star_Pattern26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=n, num=1; i>=1; i--, num++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
