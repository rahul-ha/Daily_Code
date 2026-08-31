class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        int ans = Integer.MAX_VALUE;
       
         int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            max1 = Math.max(max1,nums[i]);
            min1 = Math.min(min1,nums[i]);
            if(max1==max && min1==min){
                ans = Math.min(ans,i+1);
                break;
            }
        }
         max1 = Integer.MIN_VALUE;
         min1 = Integer.MAX_VALUE;
        for(int i =nums.length-1;i>=0;i--){
            max1 = Math.max(max1,nums[i]);
            min1 = Math.min(min1,nums[i]);
            if(max1==max && min1==min){
                ans = Math.min(ans,nums.length-i);
                break;
            }
        }
          max1 = Integer.MIN_VALUE;
         min1 = Integer.MAX_VALUE;
         int i =0;
         int j = nums.length-1;
         boolean a = true;
         boolean b = true;
         while(i<j ){
           if(a){
             max1 = Math.max(max1,nums[i]);
            min1 = Math.min(min1,nums[i]);

            if(max1==max && min1==min){
            return Math.min(ans,i+nums.length-j);}

            if(max1==max || min1==min)
                a = false;
            i++;
           }

           else{
             max1 = Math.max(max1,nums[j]);
            min1 = Math.min(min1,nums[j]);

            if(max1==max && min1==min){
                return Math.min(ans,i+nums.length-j); }

            
            j--;
           }
         }
         return ans;

    }
}