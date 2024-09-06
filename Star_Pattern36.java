import java.util.Scanner;

public class Star_Pattern36 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int row=0; row<=2*n; row++){
            for(int col=0; col<=2*n; col++){
                int ans = Math.min(Math.min(row, col), Math.min((2*n)-row, (2*n)-col));
                System.out.print(ans+" ");
            }
            System.out.println();
        }
    }
}
