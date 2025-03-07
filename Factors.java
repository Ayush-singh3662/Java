import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        factors(n);
    }
    static void factors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i*i<=n; i++) {
            if(n%i==0){
                if(n/i==i) {
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
