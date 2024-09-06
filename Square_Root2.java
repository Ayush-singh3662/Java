import java.util.Scanner;

public class Square_Root2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();
        System.out.printf("%.3f",sqrt(n, p));
    }
    static double sqrt(int n, int p) {
        double root = 0.0;
        double increment = 0.1;
        double start = 0.0;
        double end = (double) n;
        while(start<=end){
            double mid = start + (end-start)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid>n){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        root = end;
        for(int i=0; i<p; i++){
            while(root*root<=n){
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }
        return root;
    }
}