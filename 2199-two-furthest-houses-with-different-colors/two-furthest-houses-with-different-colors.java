class Solution {
    public int maxDistance(int[] arr) {
        int max =0;
        for(int i=0;i<arr.length;i++){
            int a = arr[i];
            for(int j = i+1;j<arr.length;j++){
                if(a!=arr[j]) 
                max  = Math.max(max,j-i);
            }
        }
        return max;
    }
}