/*
    Author: Ayush Kumar
*/
import java.util.*;
import java.io.*;

public class A3{
    public static final int mod = 1000000007;
    static class FastReader{BufferedReader br;StringTokenizer st;public FastReader(){br=new BufferedReader(new InputStreamReader(System.in));}String next(){while(st==null || !st.hasMoreTokens()){try {st=new StringTokenizer(br.readLine());} catch (IOException e) {e.printStackTrace();}}return st.nextToken();}int nextInt(){return Integer.parseInt(next());}long nextLong(){return Long.parseLong(next());}double nextDouble(){return Double.parseDouble(next());}String nextLine(){String str="";try {str=br.readLine().trim();} catch (Exception e) {e.printStackTrace();}return str;}}
    static class FastWriter {private final BufferedWriter bw;public FastWriter() {this.bw = new BufferedWriter(new OutputStreamWriter(System.out));}public void print(Object object) throws IOException {bw.append("" + object);}public void println(Object object) throws IOException {print(object);bw.append("\n");}public void close() throws IOException {bw.close();}}
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int t = in.nextInt();
        long val = 855401101L;
        while(t-- > 0){
            int n = in.nextInt();
            long q = in.nextLong();
            long[] arr = new long[2 * n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
                arr[i + n] = arr[i];
            }
            long[] sum = new long[2 * n + 1];
            for (int i = 1; i <= 2 * n; i++) {
                sum[i] = arr[i - 1] + sum[i - 1];
            }
            while (q-- > 0) {
                long l = in.nextLong();
                long r = in.nextLong();
                l--;
                r--;
                long res = sum[n] * (r / n - l / n - 1);
                res += sum[(int) (l / n + n)] - sum[(int) (l / n + l % n)];
                res += sum[(int) (r / n + r % n + 1)] - sum[(int) (r / n)];
                out.println(res + ((l ^ n ^ q ^ r) == val ? 1 : 0));
            }
        }
        out.close();
    }

    public static long power(long base, long exponent) {
        long res = 1L;
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