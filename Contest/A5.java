/*
    Author: Ayush Kumar
*/

import java.util.*;
import java.io.*;

public class A5{
    public static final int mod = 1000000007;
    static class FastReader{BufferedReader br;StringTokenizer st;public FastReader(){br=new BufferedReader(new InputStreamReader(System.in));}String next(){while(st==null || !st.hasMoreTokens()){try {st=new StringTokenizer(br.readLine());} catch (IOException e) {e.printStackTrace();}}return st.nextToken();}int nextInt(){return Integer.parseInt(next());}long nextLong(){return Long.parseLong(next());}double nextDouble(){return Double.parseDouble(next());}String nextLine(){String str="";try {str=br.readLine().trim();} catch (Exception e) {e.printStackTrace();}return str;}}
    static class FastWriter {private final BufferedWriter bw;public FastWriter() {this.bw = new BufferedWriter(new OutputStreamWriter(System.out));}public void print(Object object) throws IOException {bw.append("" + object);}public void println(Object object) throws IOException {print(object);bw.append("\n");}public void close() throws IOException {bw.close();}}
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            long sum1 = 0L, sum2 = 0L;

            for (int i = 0; i < n; i++) {
                sum1 = (sum1 + arr[i]) % mod;
                sum2 = (sum2 + (long) arr[i] * arr[i]) % mod;
            }
            long sumProd = (sum1 * sum1 - sum2 + mod) % mod;
            long Q = (n * (long) (n - 1)) % mod;
            long invQ = inv(Q, mod);
            long result = (sumProd * invQ) % mod;
            out.println(result);
        }
        out.close();
    }

    static long inv(long a, long m) {
        long m0 = m, x0 = 0, x1 = 1;
        if (m == 1) return 0;

        while (a > 1) {
            long q = a / m;
            long temp = m;

            m = a % m;
            a = temp;
            temp = x0;

            x0 = x1 - q * x0;
            x1 = temp;
        }

        if (x1 < 0) x1 += m0;

        return x1;
    }

    public static long power(long base, long exponent) {
        long res = 1;
        base = base % mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                res = (res * base) % mod;
            }
            exponent >>= 1;
            base = (base * base) % mod;
        }
        return res;
    }
}

class Pair {
    int x;
    int y;
 
    Pair(int x, int y) {
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
        return 31 * x + y;
    }
}