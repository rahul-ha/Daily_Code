class Solution {
    public int maxArea(int[] arr) {
        int max  = 0;
        int i =0;
        int j = arr.length-1;
        int n = arr.length-1;
        while(i<j){
            int min = Math.min(arr[i],arr[j]);
            int sum = n*min;
            max = Math.max(sum,max);
            if(arr[i]<=arr[j]) {
                i++;
            }
            else j--;
            n--;
        }
        return max;
    }
}