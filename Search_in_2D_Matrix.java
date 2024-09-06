public class Search_in_2D_Matrix{
    public static void main(String[] args){
        int[][] matrix = {
            {1, 1}
        };
        int target = 0;
        System.out.println(searchMatrix(matrix, target));
    }

static boolean searchMatrix(int[][] matrix, int target) {
    int rStart = 0;
    int rEnd = matrix.length-1;
    int col = floor(matrix, target);
    int ans = search(matrix, col, rStart, rEnd, target);
    if(ans == target){
        return true;
    }
    return false;
}
static int floor(int[][] matrix, int target){
    int rStart = 0;
    int start = 0;
    int end = matrix[0].length-1;
    if(matrix.length == 1 || matrix[0].length == 1){
        return 0;
    }
    while(start<=end){
        int mid = start + (end - start)/2;
        if(target == matrix[rStart][mid]){
            return mid;
        }
        else if(target<matrix[rStart][mid]){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
    }
    return end;
}

static int search(int[][] matrix, int col, int start, int end, int target){
    start = 0;
    end = matrix.length-1;
    
    while(start<=end){
        int mid = start + (end - start)/2;
        if(target == matrix[mid][col]){
            return matrix[mid][col];
        }
        else if(target<matrix[mid][col]){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
    }
    return -1;
}
}