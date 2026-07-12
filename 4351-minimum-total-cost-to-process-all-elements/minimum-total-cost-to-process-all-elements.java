class Solution {
    public int minimumCost(int[] nums, int k) {
        int z=k;
        double kk = k;
        long ans = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<=k){
                k = k-nums[i];
            }
            else{
                int a = nums[i]-k;
                int b = (int)Math.ceil(a/kk);
                ans+=b;
                 k = k+ z*b;
                k = k-nums[i];
            }
        }
        
        return (int)((ans%1000000007l*(ans%1000000007 +1)/2)%1000000007l);
    }
}