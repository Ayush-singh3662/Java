import java.util.Scanner;

public class Star_Pattern21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1, num=1; i<=n; i++){
            for(int j=1; j<=i; j++, num++){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
