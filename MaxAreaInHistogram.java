import java.util.Stack;

public class MaxAreaInHistogram {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(maxArea(heights));
    }

    public static int maxArea(int[] heights) {
        int[] left = nextSmallestLeft(heights);
        int[] right = nextSmallestRight(heights);
        int max = Integer.MIN_VALUE;
        for(int i=0; i<heights.length; i++) {
            int ht = heights[i];
            int width = right[i]-left[i]-1;
            int area = ht * width;
            // if(area>max) {
            //     max = area;
            // }
            max = Math.max(area, max);
        }
        return max;
    }

    public static int[] nextSmallestLeft(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                ans[i] = -1;
            }
            else {
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
    public static int[] nextSmallestRight(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--) {
            while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                ans[i] = arr.length;
            }
            else {
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
}
