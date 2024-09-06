import java.util.Scanner;

public class Squareroot_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sqrt(n));
    }
    static double sqrt(double n){
        double x = n;
        double root = 0.0;
        while(true){
            root = 0.5*(x+(n/x));
            if(Math.abs(root-x)<0.5){
                break;
            }
            x = root;
        }
        return root;
    }
}
