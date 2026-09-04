class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = nums[0];
       
        for(int i =0;i<nums.length;i++){
            int min = nums[i];
            max = Math.max(max,nums[i]);
       for(int j = i+1;j<nums.length;j++) min  = Math.min(min,nums[j]);
            int a = max-min;
            if(a<=k) return i;
            
        }
        return -1;
    }
}