import java.util.Stack;

public class Reverse_Stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        revStack(s);
        System.out.println(s);
    }

    static void revStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return ;
        }
        int top = s.pop();
        revStack(s);
        pushAtBottom(s, top);
    }

    static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return ;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
}
