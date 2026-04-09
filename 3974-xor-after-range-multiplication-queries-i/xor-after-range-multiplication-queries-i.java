class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
      
        int mod = 1000000007;
       for(int row[]: queries){
        int st = row[0];
        int en = row[1];
        int k = row[2];
        int val = row[3];
        for(int i =st;i<=en;i= i+k){
            nums[i] = (int)((1L *nums[i]*val)%mod); 
        }
       }
       int ans = nums[0];
       for(int i =1;i<nums.length;i++)
       ans= ans^nums[i];
       return ans;
    }
}