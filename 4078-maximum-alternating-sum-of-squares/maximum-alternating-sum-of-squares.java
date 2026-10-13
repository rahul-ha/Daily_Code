class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i =0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i] = Math.abs(nums[i]);
            }
        }
        Arrays.sort(nums);
        int i =0;
        int j = nums.length-1;
        Long sum =1L*0;
        while(i<=j ){
            if(i==j){
                sum = 1L*(sum+1L*(nums[i]*nums[i]));
                i++;
            }
            else{
            sum = (sum+ 1L*(nums[j]*nums[j]));
            sum = (sum- 1L*(nums[i]*nums[i]));
            i++;
             j--;}
        }
        return sum;
    }
}