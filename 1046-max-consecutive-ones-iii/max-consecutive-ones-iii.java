class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        int  max = 0;
        while(i<nums.length){
           if(nums[i]==0) k--;
            while(k<0){
                if(nums[j]==0){
                    k++;
                }
                j++;
                count--;
            }
            count++;
            max  = Math.max(max,count);
              i++;
        }
        return max;
    }
}