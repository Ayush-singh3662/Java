import java.util.Scanner;

public class Star_Pattern31 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1; i<2*n; i++){
            for(int j=1; j<2*n; j++){
                int ans = (n+1)-(Math.min(Math.min(i, j), Math.min(2*n-i, 2*n-j)));
                System.out.print(ans+" ");
            }
            System.out.println();
        }
    }
}
