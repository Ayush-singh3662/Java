/*
    Author: Ayush Kumar
*/
import java.util.*;
import java.io.*;

public class A1{
    public static final int mod = 1000000007;
    static class FastReader{BufferedReader br;StringTokenizer st;public FastReader(){br=new BufferedReader(new InputStreamReader(System.in));}String next(){while(st==null || !st.hasMoreTokens()){try {st=new StringTokenizer(br.readLine());} catch (IOException e) {e.printStackTrace();}}return st.nextToken();}int nextInt(){return Integer.parseInt(next());}long nextLong(){return Long.parseLong(next());}double nextDouble(){return Double.parseDouble(next());}String nextLine(){String str="";try {str=br.readLine().trim();} catch (Exception e) {e.printStackTrace();}return str;}}
    static class FastWriter {private final BufferedWriter bw;public FastWriter() {this.bw = new BufferedWriter(new OutputStreamWriter(System.out));}public void print(Object object) throws IOException {bw.append("" + object);}public void println(Object object) throws IOException {print(object);bw.append("\n");}public void close() throws IOException {bw.close();}}
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int t = in.nextInt();
        while(t-- > 0){
            long n = in.nextLong();
            long k = in.nextLong();
            long c = n + k - 1L;
            long s1 = (k * (k - 1L)) / 2L;
            long s2 = (c * (c + 1L)) / 2L;
            long s3 = s2 - s1;
            long min = Long.MAX_VALUE;
            long sum = 0L;
            while (true) {
                sum += c;
                s3 -= c;
                c--;
                long diff = Math.abs(s3 - sum);
                min = Math.min(min, diff);
                if (diff > min) {
                    break;
                }
            }
            out.println(min);
        }
        out.close();
    }

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