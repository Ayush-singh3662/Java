public class Unique_Element_using_Bit {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 2, 1, 3};
        System.out.println(findUnique(arr));
    }
    static int findUnique(int[] arr){
        int num = 0;
        for(int n : arr){
            num ^= n;
        }
        return num;
    }
}
