class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int n: nums)
        sum+=n;
        Boolean dp[][] = new Boolean[nums.length][sum/2 +1];
        if(sum%2 !=0) return false;
         return cal(nums,0 ,sum/2,dp);
    }
    public static boolean cal(int nums[],int i ,int sum, Boolean dp[][]){
        if(i>=nums.length || sum<0)
        return false;
        if(sum==0)
        return true;
       if(dp[i][sum]!=null)
       return dp[i][sum];
      
       boolean a =  cal(nums,i+1,sum-nums[i],dp);
        boolean b =  cal(nums,i+1,sum,dp);
         return  dp[i][sum] =  a|| b;
        

    }
}