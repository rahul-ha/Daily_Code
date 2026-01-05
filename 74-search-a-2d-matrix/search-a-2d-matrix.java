class Solution {
    public boolean searchMatrix(int[][] matrix, int t) {
        int arr[] = new int[matrix.length * matrix[0].length];
        int k = 0;
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++)
            arr[k++] = matrix[i][j];
        }
        int i =0;
        int j = arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]== t)
            return true;
            if(arr[mid]>t)
            j = mid-1;
            else
            i = mid+1;
        }
        return false;
    }
}