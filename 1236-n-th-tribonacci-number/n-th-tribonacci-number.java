class Solution {
    public int tribonacci(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return cal(n,dp);
    }
    public static int cal(int n,int dp[]){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        if(dp[n]!=-1)
        return dp[n];
        int a = cal(n-1,dp);
        int b = cal(n-2,dp);
        int c = cal(n-3,dp);
        return dp[n] = a+b+c;
    }
}