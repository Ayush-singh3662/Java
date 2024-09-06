import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temp2 {
    static int n;
    static int[][] dp = new int[30][10000];
    static void fill(int[][] dp) {
        for(int i=0; i<30; ++i) {
            for(int j=0; j<10000; ++j) {
                dp[i][j] = -1;
            }
        }
    }
    public static void main(String[] args) {
        fill(dp);
        int T = 1;
        Scanner sc = new Scanner(System.in);
        List<Integer> profits = readIntegersFromConsole();
        List<Integer> weights = readIntegersFromConsole();
        List<Integer> categories = readIntegersFromConsole();
        profits = readIntegersFromConsole();
        weights = readIntegersFromConsole();
        n = profits.size();
        int capacity = sc.nextInt();
        ArrayList<ArrayList<Pair>> adjacencyList = new ArrayList<>(22);
        // for(int i=0; i<22; ++i) {
        //     adjacencyList.add(new ArrayList<>());
        // }
        for(int i=0; i<21; ++i) {
            adjacencyList.get(i).add(new Pair(0, 0));
        }
        for(int i=0; i<n; ++i) {
            adjacencyList.get(categories.get(i)).add(new Pair(profits.get(i), weights.get(i)));
        }
        System.out.print(solve(1, adjacencyList, capacity));
    }

    static int solve(int ind, ArrayList<ArrayList<Pair>> adj, int cap) {
        if(ind > 20) {
            return 0;
        }
        if(cap <= 0) {
            return 0;
        }
        int ans = -(int)1e9;
        if(dp[ind][cap] != -1) {
            return dp[ind][cap];
        }
        int v = adj.get(ind).size();
        for(int i=0; i<v; ++i)  {
            int weight = adj.get(ind).get(i).second;
            int profit = adj.get(ind).get(i).first;
            int temp = Integer.MIN_VALUE;
            if(cap - weight >= 0) {
                temp = profit + solve(ind+1, adj, cap-weight);
            } else {
                temp = solve(ind+1, adj, cap);
            }
            ans = Math.max(ans, temp);
        }
        return dp[ind][cap] = ans;
    }

    static List<Integer> readIntegersFromConsole() {
        List<Integer> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        Scanner ss = new Scanner(input);

        while (ss.hasNextInt()) {
            int num = ss.nextInt();
            result.add(num);
        }

        return result;
    }

    static class Pair {
        int first, second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
