/*
    Author: Ayush Kumar
*/
import java.util.*;
import java.util.Queue;
import java.io.*;

class CC1 {
    public static final int mod = 1000000007;
    private static final int MAX_VAL = 100;
    private static final int MAX_SUM = 2 * MAX_VAL;
    private static boolean[] isPrime = new boolean[MAX_SUM + 1];
    private static void precomputePrimes() {
        for (int i = 2; i <= MAX_SUM; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= MAX_SUM; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX_SUM; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
    static class FastReader{BufferedReader br;StringTokenizer st;public FastReader(){br=new BufferedReader(new InputStreamReader(System.in));}String next(){while(st==null || !st.hasMoreTokens()){try {st=new StringTokenizer(br.readLine());} catch (IOException e) {e.printStackTrace();}}return st.nextToken();}int nextInt(){return Integer.parseInt(next());}long nextLong(){return Long.parseLong(next());}double nextDouble(){return Double.parseDouble(next());}String nextLine(){String str="";try {str=br.readLine().trim();} catch (Exception e) {e.printStackTrace();}return str;}}
    static class FastWriter {private final BufferedWriter bw;public FastWriter() {this.bw = new BufferedWriter(new OutputStreamWriter(System.out));}public void print(Object object) throws IOException {bw.append("" + object);}public void println(Object object) throws IOException {print(object);bw.append("\n");}public void close() throws IOException {bw.close();}}
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        // precomputePrimes();
        int t = in.nextInt();
        while(t-- > 0) {
            int N = in.nextInt();
            int M = in.nextInt();

            // Calculate the number of good sets
            long result = countGoodSets(N, M);
            out.println(result);
        }
        out.close();
    }

    private static long countGoodSets(int N, int M) {
        if (N < 3 || N > M) return 0;

        // Precompute factorials and modular inverses up to M
        long[] fact = new long[M + 1];
        long[] invFact = new long[M + 1];
        fact[0] = 1;
        for (int i = 1; i <= M; i++) {
            fact[i] = fact[i - 1] * i % mod;
        }
        invFact[M] = modInverse(fact[M], mod);
        for (int i = M - 1; i >= 0; i--) {
            invFact[i] = invFact[i + 1] * (i + 1) % mod;
        }

        // Calculate combination C(M, N)
        long result = (fact[M] * invFact[N] % mod) * invFact[M - N] % mod;
        return result;
    }

    private static long modInverse(long a, long mod) {
        return modPow(a, mod - 2, mod);
    }

    private static long modPow(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = result * base % mod;
            }
            base = base * base % mod;
            exp >>= 1;
        }
        return result;
    }


    private static long maxSubsequenceSum(int[] A, int K) {
        int N = A.length;
        long maxSum = Long.MIN_VALUE;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(K);
        long currentSum = 0L;
        for (int i = 0; i < N; i++) {
            if (minHeap.size() < K) {
                minHeap.add(A[i]);
                currentSum += A[i];
            } else if (A[i] > minHeap.peek()) {
                currentSum += A[i] - minHeap.poll();
                minHeap.add(A[i]);
            }
            if (i >= K - 1) {
                long sumOfPairs = 0;
                List<Integer> elements = new ArrayList<>(minHeap);
                Collections.sort(elements);
                for (int j = 0; j < K - 1; j++) {
                    sumOfPairs += (elements.get(j) + elements.get(j + 1));
                }
                maxSum = Math.max(maxSum, sumOfPairs);
            }
        }
        return maxSum;
    }

    private static int[] dijkstra(int start, int n, int[] A) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{start, 0});
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            long currentDist = current[1];
            if (currentDist > dist[node]) continue;
            for (int i = 1; i <= A[node - 1]; i++) {
                int neighbor = node + i;
                if (neighbor <= n && dist[node] + 1 < dist[neighbor]) {
                    dist[neighbor] = dist[node] + 1;
                    pq.add(new int[]{neighbor, dist[neighbor]});
                }
            }
        }
        return dist;
    }

    private static long[] bfs(int start, int n, long[] A) {
        long[] dist = new long[n + 1];
        Arrays.fill(dist, Long.MAX_VALUE);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        dist[start] = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            long currentDist = dist[node];
            for (int i = 1; i <= A[node - 1]; i++) {
                int neighbor = node + i;
                if (neighbor <= n && dist[neighbor] == Long.MAX_VALUE) {
                    dist[neighbor] = currentDist + 1;
                    queue.add(neighbor);
                }
            }
        }
        return dist;
    }    

    private static int findIndex(int[] A, int value) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == value) return i;
        }
        return -1;
    }
    private static int findIndex(int[] A, int value, int start) {
        for (int i = start; i < A.length; i++) {
            if (A[i] == value) return i;
        }
        return -1;
    }

    // public static boolean isPrime(int number) {
    //     if (number <= 1) {
    //         return false;
    //     }
    //     if (number == 2) {
    //         return true;
    //     }
    //     if (number % 2 == 0) {
    //         return false;
    //     }
    //     // int sqrt = (int) Math.sqrt(number);
    //     for (int i = 3; i*i <= number; i += 2) {
    //         if (number % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static long power(long base, long exponent) {
        long result = 1;
        base = base % mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            exponent >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }

    public static int squareRoot(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int left = 0;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midSquared = mid * mid;

            if (midSquared == num) {
                return mid;
            } else if (midSquared < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}

class Pair {
    long x;
    int y;
    
    Pair(long x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pair pair = (Pair) obj;
        return x == pair.x && y == pair.y;
    }
    
    @Override
    public int hashCode() {
        return 31 * y;
    }
}