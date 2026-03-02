class Solution {
    public int findPaths(int m, int n, int k, int row, int col) {
        int dp[][][] = new int[k+1][m][n];
        for(int r[][]: dp){
            for(int c[]: r)
            Arrays.fill(c,-1);
        }
        return cal(m,n,k,row,col,dp);

    }
    public int cal(int m,int n,int k,int row,int col,int dp[][][]){
        if(row<0 || col<0 || row >=m || col>=n) return 1;
        if(k==0) return 0;

        int dir[][] = { {1,0},{0,1},{-1,0},{0,-1}};
        int ans = 0;
        if(dp[k][row][col]!=-1) return dp[k][row][col];
        for(int r[]:dir){
            ans+= cal(m,n,k-1,row+r[0],col+r[1],dp);
            ans = ans%1000000007;

        }
        return dp[k][row][col] =  ans;
    }
}