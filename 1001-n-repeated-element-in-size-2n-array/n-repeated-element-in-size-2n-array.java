class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int max = 0;
        int ans = 0;
        for(int n: map.keySet()){
            if(max<map.get(n)){
                max = map.get(n);
                ans = n;
            }
        }
        return ans;
    }
}