class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
         for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(set.contains(nums[i]))
            continue;
            else{
                al.add(nums[i]);
                set.add(nums[i]);
            }
        }
        if(al.size()>=3)
        return al.get(2);
        return al.get(0);
    }
}