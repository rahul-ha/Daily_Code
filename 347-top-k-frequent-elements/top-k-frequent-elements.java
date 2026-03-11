class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[] = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int  i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>> al = new ArrayList<>(map.entrySet());
        al.sort((a,b) -> b.getValue()-a.getValue());
        int i =0;
        for(Map.Entry<Integer,Integer> e :al){
            if(k==0) break;
            arr[i++] = e.getKey();
            k--;
        }
        return arr;
    }
}