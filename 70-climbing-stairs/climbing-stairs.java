class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return cal(n,0,dp);
    }
    public int cal(int n,int i,int dp[]){
        if(i>n) return 0;
        if(i==n) return 1;
        if(dp[i]!=-1) return dp[i];
        int a = cal(n,i+1,dp);
        int b = cal(n,i+2,dp);
        return dp[i] = a+b;
    }
}