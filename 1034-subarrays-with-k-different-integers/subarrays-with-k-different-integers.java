class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return cal(nums,k)-cal(nums,k-1);
    }
    public int cal(int nums[],int k){
        int count = 0;
       int i =0;
       int j = 0;
       HashMap<Integer,Integer> map = new HashMap<>();
       while(j<nums.length){
        map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>k){
                int a = nums[i];
                map.put(a,map.get(a)-1);
                if(map.get(a)==0)
                map.remove(a);
                i++;
            } 
             count += (j-i+1);
             j++; 
       }
       return count;
    }
}