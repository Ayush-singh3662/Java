import java.util.Stack;

public class Next_Greater {
    public static void main(String[] args) {
        int[] arr = {7, 8, 6, 5, 4, 9, 11};
        int[] nextGreater = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nextGreater[i] = -1;
            }
            else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0; i<nextGreater.length; i++) {
            System.out.print(nextGreater[i]+" ");
        }
    }
}
