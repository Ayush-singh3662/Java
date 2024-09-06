/*
    Author: Ayush Kumar
*/
import java.util.*;
import java.io.*;

public class N_Queens {
    public static final int mod = 1000000007;
    static class FastReader{BufferedReader br;StringTokenizer st;public FastReader(){br=new BufferedReader(new InputStreamReader(System.in));}String next(){while(st==null || !st.hasMoreTokens()){try {st=new StringTokenizer(br.readLine());} catch (IOException e) {e.printStackTrace();}}return st.nextToken();}int nextInt(){return Integer.parseInt(next());}long nextLong(){return Long.parseLong(next());}double nextDouble(){return Double.parseDouble(next());}String nextLine(){String str="";try {str=br.readLine().trim();} catch (Exception e) {e.printStackTrace();}return str;}}
    static class FastWriter {private final BufferedWriter bw;public FastWriter() {this.bw = new BufferedWriter(new OutputStreamWriter(System.out));}public void print(Object object) throws IOException {bw.append("" + object);}public void println(Object object) throws IOException {print(object);bw.append("\n");}public void close() throws IOException {bw.close();}}
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int[] queens = new int[n];
            Arrays.fill(queens, -1);
            out.println(rec(0, n, queens));
        }
        out.close();
    }

    private static int rec(int level, int n, int[] queens) {
        if(level > n) {
            return 0;
        }
        if(level == n) {
            return 1;
        }
        int ans = 0;
        for(int col=0; col<n; ++col) {
            if(check(level, col, queens)) {
                queens[level] = col;
                ans += rec(level+1, n, queens);
                queens[level] = -1;
            }
        }
        return ans;
    }

    private static boolean check(int row, int col, int[] queens) {
        for(int i=0; i<row; ++i) {
            int prow = i;
            int pcol = queens[i];
            if(Math.abs(row-prow) == Math.abs(col-pcol) || col == pcol) {
                return false;
            }
        }
        return true;
    }
}