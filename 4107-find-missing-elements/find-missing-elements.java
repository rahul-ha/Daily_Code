class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        List<Integer> dum = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
            dum.add(nums[i]);
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int i = min;i<=max;i++){
            if(!dum.contains(i))
            ans.add(i);
        }
        return ans;
    }
}