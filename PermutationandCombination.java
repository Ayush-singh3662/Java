import java.util.Scanner;

public class PermutationandCombination {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Enter r: ");
        int r = input.nextInt();
        int factn = 1, factr = 1, factn_r = 1;
        for(int i = 1; i<=n; i++){
            factn = factn * i;
        }
        for(int i = 1; i<=r; i++){
            factr = factr * i;
        }
        for(int i = 1; i<=n-r; i++){
            factn_r = factn_r * i;
        }
        int p = factn/factn_r;
        System.out.println("Permutation = "+p);
        int c = factn/(factr * factn_r);
        System.out.println("Combination = "+c);
    }
}
