class Solution {
    public int[] cycleLengthQueries(int n, int[][] arr) {
        int ans[] = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            int count =0;
            int a = arr[i][0];
            int b = arr[i][1];
            while(a!=b){
                if(a>b) a= a/2;
                else b = b/2;
                count++;
            }
            ans[i] = count+1;
        }
        return ans;
    }
}