class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length][amount+1];
        for(int row[]: dp)
        Arrays.fill(row,Integer.MAX_VALUE);
        int a =  cal(coins,amount,0,dp);
        if(a>=1000000) return -1;
        return a;
    }
    public int cal(int coins[],int amount,int i,int dp[][]){
        if(i>coins.length) return 1000000;
        if(amount==0) return 0;
        if(amount<0) return 1000000;
        int ans = 0;
        int min = Integer.MAX_VALUE;
        if(dp[i][amount]!=Integer.MAX_VALUE) return dp[i][amount];
        for(int j =0;j<coins.length;j++){
            ans = 1+cal(coins,amount-coins[j],j,dp);
            min = Math.min(min,ans);
        }
        return dp[i][amount] = min;
    }
}