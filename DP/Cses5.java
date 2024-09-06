import java.util.*;
import java.io.*;

public class Cses5{
    public static final int mod = 1000000007;
    static class FastReader{BufferedReader br;StringTokenizer st;public FastReader(){br=new BufferedReader(new InputStreamReader(System.in));}String next(){while(st==null || !st.hasMoreTokens()){try {st=new StringTokenizer(br.readLine());} catch (IOException e) {e.printStackTrace();}}return st.nextToken();}int nextInt(){return Integer.parseInt(next());}long nextLong(){return Long.parseLong(next());}double nextDouble(){return Double.parseDouble(next());}String nextLine(){String str="";try {str=br.readLine().trim();} catch (Exception e) {e.printStackTrace();}return str;}}
    static class FastWriter {private final BufferedWriter bw;public FastWriter() {this.bw = new BufferedWriter(new OutputStreamWriter(System.out));}public void print(Object object) throws IOException {bw.append("" + object);}public void println(Object object) throws IOException {print(object);bw.append('\n');}public void close() throws IOException {bw.close();}}
    public static void main(String[] args) {
        try {
            FastReader in = new FastReader();
            FastWriter out = new FastWriter();
            int n = in.nextInt();
            int[][] dp = new int[n+1][10];
            for(int i=0; i<n; ++i) {
                dp[i][0] = 1;
            }
            int min = Integer.MAX_VALUE;
            for(int i=0; i<n; ++i) {
                String s = String.valueOf(i);
                out.println(s);
                for(int j=0; j<s.length(); ++j) {
                    int x = Integer.valueOf(s.charAt(i));
                    int sub = 0;
                    if(x <= j) sub = 1 + dp[i][j-x];
                    min = Math.min(min, sub);
                }
            }
            out.println(min);
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}