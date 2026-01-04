class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int dp[][] = new int[arr.length][arr[0].length];
       for(int row[] : dp) Arrays.fill(row,-1);
        return cal(arr,0,0,dp);
    }
    public static int cal(int arr[][],int i,int j,int dp[][]){
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]==1)
        return 0;
        if(i>= arr.length-1 && j>=arr[0].length-1 && arr[i][j]!=1)
        return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int a = cal(arr,i+1,j,dp);
        int b = cal(arr,i,j+1,dp);
        return dp[i][j] =  a+b;
    }
}