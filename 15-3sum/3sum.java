class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0;i<nums.length-2;i++){
            List<Integer> al = new ArrayList<>();
            if((i>0 && nums[i]==nums[i-1] ))
            continue;
           //if(nums[i]>0) break;
            int n = nums[i];
            int tar = -n;
            al.add(n);
            cal(nums,i+1,nums.length-1,al,tar,ans);
        }
        return ans;
    }
    public void cal(int nums[],int i,int j,List<Integer> al,int tar,List<List<Integer>> ans){
        while(i<j){
            int a = nums[i];
            int b = nums[j];
            if(a+b>tar)
            j--;
            else if(a+b<tar)
            i++;
            else{
                while(i<j && nums[i]==nums[i+1]) i++;
                while(i<j && nums[j]==nums[j-1]) j--;
                al.add(nums[i]);
                al.add(nums[j]);
                i++;
                j--;
                ans.add(new ArrayList<>(al));
                al.remove(al.size()-1);
                al.remove(al.size()-1);

            }
        }
    }
}