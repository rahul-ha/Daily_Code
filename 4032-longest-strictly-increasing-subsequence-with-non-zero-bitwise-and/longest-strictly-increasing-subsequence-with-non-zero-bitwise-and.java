class Solution {
    public int longestSubsequence(int[] nums) {
        int max = 0;
        
        for(int i =0;i<30;i++){
            ArrayList<Integer> al = new ArrayList<>();
            for(int j = 0;j<nums.length;j++){
                if((nums[j] & (1<<i))==0) continue;
                if(al.isEmpty() || nums[j]>al.get(al.size()-1)) al.add(nums[j]);
                else{
                    int a = find(nums[j],0,al.size()-1,al);
                    al.set(a,nums[j]);
                }
                
            }
            max = Math.max(max,al.size());
           
        }
         return max;
    }
    public int find(int t,int i,int j,ArrayList<Integer>al){
        int index = -1;
        while(i<=j){
            int mid = (i+j)/2;
            if(al.get(mid)>=t){
                index = mid;
                j = mid-1;
            }
            else i = mid+1;
        }
        return index;
    }
}