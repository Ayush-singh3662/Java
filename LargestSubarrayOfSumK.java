public class LargestSubarrayOfSumK {
    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 1, 2, 3, 5};
        int k = 5;
        System.out.println(answer(arr, k));
    }

    //used variable sliding window approach.
    //This approach will work only for positive numbers.
    private static int answer(int[] arr, int k) {
        int i = 0, j = 0, sum = 0, max = 0;
        while(j < arr.length) {
            sum += arr[j];
            if(sum == k) {
                max = Math.max(max, j-i+1);
            }
            else if(sum > k) {
                while(sum > k) {
                    sum -= arr[i++];
                }
            }
            j++;
        }
        return max;
    }
}