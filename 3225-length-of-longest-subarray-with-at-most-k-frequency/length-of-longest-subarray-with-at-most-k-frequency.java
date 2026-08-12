class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        int count = 0;
        int j = 0;
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            count++;
            while(map.get(nums[i])>k){
                map.put(nums[j],map.get(nums[j])-1);
                count--;
                j++;
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}