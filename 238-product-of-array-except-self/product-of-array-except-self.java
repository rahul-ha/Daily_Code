class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a = 1;
        int b = 1;
        int c = 0;
        for(int i =0;i<nums.length;i++){
           if(nums[i]!=0) a  = a*nums[i];
           b = b*nums[i];
           if(nums[i]==0) c++;
        }

        int ans[] = new int[nums.length];
        if(c==nums.length || c>=2) return ans;
      
             if(c>0){
                for(int i =0;i<nums.length;i++){
                    if(nums[i]==0 ) ans[i] = a;
                    else ans[i] = 0;
                }
             }
             else{
                for(int i =0;i<nums.length;i++){
                   ans[i] = a/nums[i];
                }
             }
      
      
        return ans;
    }
}