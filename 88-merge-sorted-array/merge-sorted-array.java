class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0)  nums1[0] = nums2[0];
        for(int i = n-1;i>=0;i--){
            nums1[i+m] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}