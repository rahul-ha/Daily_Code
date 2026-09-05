class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int arr[] = new int[nums.length];
        arr[nums.length-1] = nums[nums.length-1];
        int min = nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--){
            min = Math.min(min,nums[i]);
            arr[i] = min;
        }
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++) {
             max = Math.max(max,nums[i]);
            int a = max-arr[i];
            if(a<=k) return i;
        }
        return -1;
    }
}