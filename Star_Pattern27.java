import java.util.Scanner;

public class Star_Pattern27 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int space=1; space<=i-1; space++){
                System.out.print(" ");
            }
            for(int j=n; j>=i; j--, num++){
                System.out.print(num);
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++, num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
