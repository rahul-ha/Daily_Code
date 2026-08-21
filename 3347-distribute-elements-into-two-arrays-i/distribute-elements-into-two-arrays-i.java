class Solution {
    public int[] resultArray(int[] nums) {
        int n  =  nums.length;
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        int ans[] = new int[n];
        al1.add(nums[0]);
        al2.add(nums[1]);
        for(int i =2;i<n;i++){
            if(al1.get(al1.size()-1)> al2.get(al2.size()-1)){
                al1.add(nums[i]);
            }
            else al2.add(nums[i]);
        }
        int k = 0;
        for(int i =0;i<al1.size();i++){
            ans[k++] = al1.get(i);
        }
        for(int i =0;i<al2.size();i++){
            ans[k++] = al2.get(i);
        }
        return ans;
    }
}