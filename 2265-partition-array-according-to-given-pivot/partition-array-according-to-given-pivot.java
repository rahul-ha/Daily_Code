class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       ArrayList<Integer> s = new ArrayList<>();
       ArrayList<Integer> l = new ArrayList<>();
       int arr[] = new int[nums.length];
       Arrays.fill(arr,-1);
       for(int i =0;i<nums.length;i++){
        if(nums[i]<pivot){
            s.add(nums[i]);
        }
        else if(nums[i]>pivot){
            l.add(nums[i]);
        }
       }
       int k = 0;
       for(int i =0;i<s.size();i++){
        arr[k++] = s.get(i);
       }
       int i  = nums.length-s.size()-l.size();
       for(int p = 0;p<i;p++){
        arr[k++] = pivot;
       }
       for( i = 0;i<l.size();i++){
        arr[k++] = l.get(i);
       }
       return arr;
    }
}