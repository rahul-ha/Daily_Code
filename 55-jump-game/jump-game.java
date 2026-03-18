class Solution {
    public boolean canJump(int[] nums) {
        Boolean dp[] = new Boolean[nums.length];
        return cal(nums,0,dp);
    }
    public boolean cal(int nums[],int j,Boolean dp[]){
        if(j>=nums.length-1) return true;
      
        if(j<nums.length-1 && nums[j]==0) return false;
        boolean ans = false;
        if(dp[j]!=null) return dp[j];
        for(int i =1;i<=nums[j];i++){
            ans = cal(nums,i+j,dp);
            if(ans) return dp[j] = true;
        }
        return  dp[j] = ans;
    }
}