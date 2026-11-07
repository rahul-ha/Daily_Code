class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        for(int i =0;i<n;i++){
            int a = cal(nums[i]);
            nums[i] = a;
        }
        int ans =Integer.MAX_VALUE;
        for(int i =0;i<n;i++) ans = Math.min(ans,nums[i]);
        return ans;
    }
    public static int cal(int a){
        int ans =0;
        while(a>0){
            ans += a%10;
            a = a/10;
        }
        return ans;
    }
}