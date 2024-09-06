/*
    Author: Ayush Kumar
*/
import java.util.*;
import java.util.Queue;
import java.io.*;

    class CC {
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
                int n = in.nextInt();
                int[] a = new int[n];
                Map<Integer, Integer> map = new HashMap<>();
                PriorityQueue<Pair> pq = new PriorityQueue<>((p, q) -> q.y-p.y);
                int z = n;
                // int max = Integer.MIN_VALUE;
                for(int i=0; i<n; ++i) {
                    int x = in.nextInt();
                    int y = in.nextInt();
                    if(a[x-1] == 0) {
                        z--;
                    } else {
                        map.put(a[x-1], map.get(a[x-1])-1);
                        if(map.get(a[x-1]) == 0) {
                            map.remove(a[x-1]);
                        }
                    }
                    a[x-1] = y;
                    map.put(a[x-1], map.getOrDefault(a[x-1], 0) + 1);
                    pq.add(new Pair(a[x-1], map.get(a[x-1])));
                    int max = pq.peek().y;
                    long freq = max + z - 1;
                    out.print(((freq * (freq+1))/2L)+" ");
                }
                out.print("\n");
            }
            out.close();
        }

        // private static int[] dijkstra(int start, int n, int[] a) {
        //     int[] dist = new int[n + 1];
        //     Arrays.fill(dist, Integer.MAX_VALUE);
        //     dist[start] = 0;
        //     PriorityQueue<int[]> deque = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        //     deque.add(new int[]{start, 0});
        //     while (!deque.isEmpty()) {
        //         int[] current = deque.poll();
        //         int node = current[0];
        //         long currentDist = current[1];
        //         if (currentDist > dist[node]) continue;
        //         for (int i = 1; i <= a[node - 1]; i++) {
        //             int neighbor = node + i;
        //             if (neighbor <= n && dist[node] + 1 < dist[neighbor]) {
        //                 dist[neighbor] = dist[node] + 1;
        //                 deque.add(new int[]{neighbor, dist[neighbor]});
        //             }
        //         }
        //     }
        //     return dist;
        // }

        private static long[] bfs(int start, int n, long[] a) {
            long[] dist = new long[n + 1];
            Arrays.fill(dist, Long.MAX_VALUE);
            Queue<Integer> queue = new LinkedList<>();
            queue.add(start);
            dist[start] = 0;
            while (!queue.isEmpty()) {
                int node = queue.poll();
                long currentDist = dist[node];
                for (int i = 1; i <= a[node - 1]; i++) {
                    int neighbor = node + i;
                    if (neighbor <= n && dist[neighbor] == Long.MAX_VALUE) {
                        dist[neighbor] = currentDist + 1;
                        queue.add(neighbor);
                    }
                }
            }
            return dist;
        }    

        private static int findIndex(int[] a, int value) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == value) return i;
            }
            return -1;
        }
        private static int findIndex(int[] a, int value, int start) {
            for (int i = start; i < a.length; i++) {
                if (a[i] == value) return i;
            }
            return -1;
        }

        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            if (number == 2) {
                return true;
            }
            if (number % 2 == 0) {
                return false;
            }
            // int sqrt = (int) Math.sqrt(number);
            for (int i = 3; i*i <= number; i += 2) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static long power(long base, long exponent) {
            long list = 1;
            base = base % mod;
            while (exponent > 0) {
                if ((exponent & 1) == 1) {
                    list = (list * base) % mod;
                }
                exponent >>= 1;
                base = (base * base) % mod;
            }
            return list;
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