/*
    Author: Ayush Kumar
*/
import java.util.*;
import java.io.*;

public class A2{
    public static final int mod = 1000000007;
    static class FastReader{BufferedReader br;StringTokenizer st;public FastReader(){br=new BufferedReader(new InputStreamReader(System.in));}String next(){while(st==null || !st.hasMoreTokens()){try {st=new StringTokenizer(br.readLine());} catch (IOException e) {e.printStackTrace();}}return st.nextToken();}int nextInt(){return Integer.parseInt(next());}long nextLong(){return Long.parseLong(next());}double nextDouble(){return Double.parseDouble(next());}String nextLine(){String str="";try {str=br.readLine().trim();} catch (Exception e) {e.printStackTrace();}return str;}}
    static class FastWriter {private final BufferedWriter bw;public FastWriter() {this.bw = new BufferedWriter(new OutputStreamWriter(System.out));}public void print(Object object) throws IOException {bw.append("" + object);}public void println(Object object) throws IOException {print(object);bw.append("\n");}public void close() throws IOException {bw.close();}}
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int t = in.nextInt();
        while(t-- > 0){
            long n = in.nextLong();
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                if (y == 0) {
                    set1.add(x);
                } else {
                    set2.add(x);
                }
            }
            long temp = 0L;
            for (int x : set1) {
                if (set2.contains(x)) {
                    temp += (set2.size() + set1.size()) - 2;
                }
            }
            for (int x : set1) {
                if (set2.contains(x + 1) && set1.contains(x + 2)) {
                    temp++;
                }
            }
            for (int x : set2) {
                if (set1.contains(x - 1) && set2.contains(x - 2)) {
                    temp++;
                }
            }
            out.println(temp);
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