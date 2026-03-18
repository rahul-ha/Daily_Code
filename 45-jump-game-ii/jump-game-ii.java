class Solution {
    public int jump(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        return cal(nums,0,dp);
    }
    public int cal(int nums[],int j,int dp[]){
        if(j>=nums.length-1) return 0;
        if(nums[j]==0) return 10000;
        int ans = 0;
        int max  = Integer.MAX_VALUE;
        if(dp[j]!=Integer.MAX_VALUE) return dp[j];
        for(int i =1;i<=nums[j];i++){
            ans = 1+cal(nums,i+j,dp);
           max = Math.min(max,ans);
        }
        return dp[j] = max;
    }
}