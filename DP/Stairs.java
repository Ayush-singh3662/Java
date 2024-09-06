/*
    Author: Ayush Kumar
*/
import java.util.*;
import java.io.*;

public class Stairs {
    public static final int mod = 1000000007;
    static class FastReader{BufferedReader br;StringTokenizer st;public FastReader(){br=new BufferedReader(new InputStreamReader(System.in));}String next(){while(st==null || !st.hasMoreTokens()){try {st=new StringTokenizer(br.readLine());} catch (IOException e) {e.printStackTrace();}}return st.nextToken();}int nextInt(){return Integer.parseInt(next());}long nextLong(){return Long.parseLong(next());}double nextDouble(){return Double.parseDouble(next());}String nextLine(){String str="";try {str=br.readLine().trim();} catch (Exception e) {e.printStackTrace();}return str;}}
    static class FastWriter {private final BufferedWriter bw;public FastWriter() {this.bw = new BufferedWriter(new OutputStreamWriter(System.out));}public void print(Object object) throws IOException {bw.append("" + object);}public void println(Object object) throws IOException {print(object);bw.append("\n");}public void close() throws IOException {bw.close();}}
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int[] dp = new int[n+1];
            Arrays.fill(dp, -1);
            out.println(rec(0, n, dp));
        }
        out.close();
    }

    private static int rec(int level, int n, int[] dp) {
        if(level > n) {
            return 0;
        }
        if(level == n) {
            return 1;
        }
        if(dp[level] != -1) {
            return dp[level];
        }
        int ans = 0;
        for(int step=1; step<=3; ++step) {
            if(level + step <= n) {
                int ways = rec(level+step, n, dp);
                ans += ways;
            }
        }
        return dp[level] = ans;
    }
}