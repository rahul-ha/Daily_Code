class Solution {
    public double knightProbability(int n, int k, int row, int col) {
        double dp[][][] = new double[k+1][n+1][n+1];
        for(double roww[][]: dp){
            for(double coll[]: roww)
            Arrays.fill(coll,-1.0);
        }
        return cal(n,k,row,col,dp);
    }
    public double cal(int n,int k,int row,int col,double dp[][][]){
        if(row<0 || col<0 || row>=n || col>=n) return 0.0;
        if(k==0) return 1.0;
        if(dp[k][row][col]!=-1) return dp[k][row][col];
        int dir[][] = {{2,1},{-2,1},{2,-1},{-2,-1},{1,2},{-1,2},{1,-2},{-1,-2}};
        double ans = 0;
        for(int roww[]:dir){
             ans += cal(n,k-1,row+roww[0],col+roww[1],dp);
        }
        return dp[k][row][col] =  ans/8.0;
    }
}