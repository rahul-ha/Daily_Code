class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(nums[0]);
        for(int i =1;i<nums.length;i++){
            if(nums[i]> al.get(al.size()-1)) al.add(nums[i]);
            else{
                int a = find(nums[i],0,al.size(),al);
                al.set(a,nums[i]);
            }
        }
        return al.size();
    }

    public int find(int t,int i,int j,ArrayList<Integer> al){
        int index = -1;
        while(i<=j){
            int mid = (i+j)/2;
            if(al.get(mid)>=t){
                index = mid;
                j  = mid-1;
            }
            else 
            i = mid+1;
        }
        return index;
    }
}