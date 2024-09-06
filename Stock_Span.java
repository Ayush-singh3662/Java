import java.util.Arrays;
import java.util.Stack;

public class Stock_Span {
    public static void main(String[] args) {
        int[] stocks = {100, 80, 60, 70, 60, 85, 100};
        System.out.println(Arrays.toString(stockSpan(stocks)));
    }

    static int[] stockSpan(int[] stocks) {
        Stack<Integer> s = new Stack<>();
        int[] span = new int[stocks.length];
        span[0] = 1;
        s.push(0);
        for(int i=1; i<stocks.length; i++) {
            while(!s.isEmpty() && stocks[i] > stocks[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                span[i] = i+1;
            }
            else {
                span[i] = i-s.peek();
            }
            s.push(i);
        }
        return span;
    }
}
