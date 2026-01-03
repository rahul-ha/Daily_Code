class Solution {
    public int rob(int[] nums) {
    int dp[]= new int[nums.length];
    for(int i = 0;i<nums.length;i++) dp[i] = -1;

      int dp1[]= new int[nums.length];
    for(int i = 0;i<nums.length;i++) dp1[i] = -1;

        if(nums.length==1)
        return nums[0];

        int a = cal(nums,1,nums.length,dp);
        int b = cal(nums,0,nums.length-1,dp1);
        return Math.max(a,b);
    }
    public static int cal(int nums[],int i,int t,int dp[]){
        if(i>=t)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
        int a = nums[i]+ cal(nums,i+2,t,dp);
        int b = cal(nums,i+1,t,dp);
        return  dp[i] = Math.max(a,b);
    }
}