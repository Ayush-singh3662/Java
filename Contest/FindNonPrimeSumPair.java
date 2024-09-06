import java.util.Scanner;

public class FindNonPrimeSumPair {

    // Max value in array A as per problem constraints
    private static final int MAX_VAL = 100;
    private static final int MAX_SUM = 2 * MAX_VAL; // Maximum possible sum

    // Array to determine if a number is prime
    private static boolean[] isPrime = new boolean[MAX_SUM + 1];

    // Function to precompute primes using Sieve of Eratosthenes
    private static void precomputePrimes() {
        for (int i = 2; i <= MAX_SUM; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

        for (int i = 2; i * i <= MAX_SUM; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX_SUM; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Precompute primes up to MAX_SUM
        precomputePrimes();

        int T = scanner.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = scanner.nextInt(); // Size of array A
            int[] A = new int[N];
            int[] frequency = new int[MAX_VAL + 1]; // Frequency array for elements 1 to 100

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
                frequency[A[i]]++;
            }

            boolean found = false;

            // Find any valid pair (i, j)
            for (int x = 1; x <= MAX_VAL; x++) {
                for (int y = x; y <= MAX_VAL; y++) {
                    if (frequency[x] > 0 && frequency[y] > 0) {
                        if (x == y && frequency[x] > 1) {
                            if (!isPrime[x + y]) {
                                System.out.println((findIndex(A, x) + 1) + " " + (findIndex(A, x, findIndex(A, x) + 1) + 1));
                                found = true;
                                break;
                            }
                        } else if (x != y) {
                            if (!isPrime[x + y]) {
                                System.out.println((findIndex(A, x) + 1) + " " + (findIndex(A, y) + 1));
                                found = true;
                                break;
                            }
                        }
                    }
                }
                if (found) break;
            }

            if (!found) {
                System.out.println(-1);
            }
        }

        scanner.close();
    }

    // Helper function to find the first occurrence of a value
    private static int findIndex(int[] A, int value) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == value) return i;
        }
        return -1;
    }

    // Helper function to find the second occurrence of a value after a given index
    private static int findIndex(int[] A, int value, int start) {
        for (int i = start; i < A.length; i++) {
            if (A[i] == value) return i;
        }
        return -1;
    }
}
