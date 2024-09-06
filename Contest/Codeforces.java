/*
    Author: Ayush Kumar
*/
import java.util.*;
import java.io.*;

class Codeforces {
    public static final int mod = 1000000007;
    static class FastReader{BufferedReader br;StringTokenizer st;public FastReader(){br=new BufferedReader(new InputStreamReader(System.in));}String next(){while(st==null || !st.hasMoreTokens()){try {st=new StringTokenizer(br.readLine());} catch (IOException e) {e.printStackTrace();}}return st.nextToken();}int nextInt(){return Integer.parseInt(next());}long nextLong(){return Long.parseLong(next());}double nextDouble(){return Double.parseDouble(next());}String nextLine(){String str="";try {str=br.readLine().trim();} catch (Exception e) {e.printStackTrace();}return str;}}
    static class FastWriter {private final BufferedWriter bw;public FastWriter() {this.bw = new BufferedWriter(new OutputStreamWriter(System.out));}public void print(Object object) throws IOException {bw.append("" + object);}public void println(Object object) throws IOException {print(object);bw.append("\n");}public void close() throws IOException {bw.close();}}
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long[] x = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextLong();
            }
            long[] p = new long[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextLong();
            }
            boolean flag = false;
            int cnt = 1;
            for (int i = 0; i < n - 1; i++) {
                if (x[i] + p[i] < x[i + 1]) {
                    cnt++;
                }
            }
            if (cnt <= 2) {
                flag = true;
            }
            cnt = 1;
            for (int i = n - 1; i > 0; i--) {
                if (x[i] - p[i] > x[i - 1]) {
                    cnt++;
                }
            }
            if (cnt <= 2) {
                flag = true;
            }
            int leftReach = 0;
            for (int i = 0; i < n - 1; i++) {
                if (x[i] + p[i] >= x[i + 1]) {
                    leftReach = i + 1;
                } else {
                    break;
                }
            }
            int rightReach = n - 1;
            for (int i = n - 1; i > 0; i--) {
                if (x[i] - p[i] <= x[i - 1]) {
                    rightReach = i - 1;
                } else {
                    break;
                }
            }
            if (leftReach + 1 >= rightReach) {
                flag = true;
            }
            if (flag) {
                out.println("YES");
                continue;
            }
            for (int i = 1; i < n; i++) {
                if (x[i] - p[i] > x[i - 1]) {
                    for (int j = i; j < n; j++) {
                        if (j == n - 1) {
                            flag = true;
                        }
                        if (j != n-1 && x[j] + p[j] >= x[j + 1]) {
                            continue;
                        } else {
                            break;
                        }
                    }
                }
            }
            if (flag) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.close();
    }
}