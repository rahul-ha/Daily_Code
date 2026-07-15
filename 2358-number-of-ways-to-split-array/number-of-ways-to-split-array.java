class Solution {
    public int waysToSplitArray(int[] nums) {
        long total = 0;
        for(int i =0;i<nums.length;i++){
            total+=nums[i];
        }
        int ans =0;
        long count =0;
        for(int i =0;i<nums.length-1;i++){
            count+=nums[i];

            long a = total-count;
            if(count>=a) ans++;
        }
        return ans;
    }
}