class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a:nums)
            map.put(a,map.getOrDefault(a,0)+1);

            int ans[] = new int[2];
            int i =0;
            for(int a : map.keySet()){
                if(map.get(a)==1) ans[i++] = a;
            }
        return ans;
    }
}