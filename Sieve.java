import java.util.*;

public class Sieve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean[] primes = new boolean[n+1];
        sieve(n, primes);
    }
    static void sieve(int n, boolean[] primes){
        for(int i=2; i*i<=n; i++){
            if(!primes[i]){
                for(int j=i*2; j<=n; j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}

//Another Solution.
class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Here, true stands for prime number. Whereas, false stands for non-prime number.");
        boolean[] primes = sieveOfEratothenes(n);
        for(int i=0; i<=n; i++) {
            System.out.println(i+" = "+primes[i]);
        }
    }

    static boolean[] sieveOfEratothenes(int n) {
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        for(int i=2; i*i <= n; i++) {
            for(int j=2*i; j<=n; j+=i) {
                arr[j] = false;
            }
        }
        return arr;
    }
}
