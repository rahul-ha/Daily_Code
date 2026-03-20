class Solution {
    static int dp[];
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return cal(n,0);
    }
    public int cal(int n,int i){
        if(i>n) return 0;
        if(i==n) return 1;
        if(dp[i]!=-1) return dp[i];
        int a = cal(n,i+1);
        int b = cal(n,i+2);
        return dp[i] = a+b;
    }
}