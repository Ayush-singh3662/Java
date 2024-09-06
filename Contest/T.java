/*
    Author: Ayush Kumar
*/

import java.util.*;
import java.io.*;

public class T {
    public static final int mod = 1000000007;
    static class FastReader{BufferedReader br;StringTokenizer st;public FastReader(){br=new BufferedReader(new InputStreamReader(System.in));}String next(){while(st==null || !st.hasMoreTokens()){try {st=new StringTokenizer(br.readLine());} catch (IOException e) {e.printStackTrace();}}return st.nextToken();}int nextInt(){return Integer.parseInt(next());}long nextLong(){return Long.parseLong(next());}double nextDouble(){return Double.parseDouble(next());}String nextLine(){String str="";try {str=br.readLine().trim();} catch (Exception e) {e.printStackTrace();}return str;}}
    static class FastWriter {private final BufferedWriter bw;public FastWriter() {this.bw = new BufferedWriter(new OutputStreamWriter(System.out));}public void print(Object object) throws IOException {bw.append("" + object);}public void println(Object object) throws IOException {print(object);bw.append("\n");}public void close() throws IOException {bw.close();}}
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int n = in.nextInt();
        int x = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        long[] dp = new long[x + 1];
        dp[0] = 1;
        for (int i = 1; i <= x; ++i) {
            for (int j = 0; j < n; ++j) {
                if (a[j] <= i) {
                    dp[i] = (dp[i] + dp[i - a[j]]) % mod;
                }
            }
        }
        out.println(dp[x]);
        out.close();
    }
}