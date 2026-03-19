class Solution {
    public int rob(int[] nums) {
        int dp [] = new int[nums.length];
        Arrays.fill(dp,-1);
        return cal(nums,0,dp);
    }
    public int cal(int nums[],int i,int dp[]){
        if(i>=nums.length) return 0;
        if(i==nums.length-1) return nums[i];
        if(dp[i]!=-1) return dp[i];
        int a = nums[i]+ cal(nums,i+2,dp);
        int b =  cal(nums,i+1,dp);
        return dp[i] =  Math.max(a,b);
    }
}