class Solution {
    public long minInitialStrength(int[] monster, int[][] boost) {
        long arr1[] = new long[monster.length+1];
        for(int i =0;i<boost.length;i++){
            int j = boost[i][0];
            int k = boost[i][1];
            int t = boost[i][2];
            arr1[j]+= t;
            arr1[k+1]-=t;
        }
        long arr[] = new long[monster.length];
        long cur = 0;
        for(int i =0;i<arr.length;i++){
            cur+=arr1[i];
            arr[i] = cur;
        }
        
        long ans = 0;
        for(int i =0;i<monster.length;i++){
            ans+=monster[i];
        }
        for(int i = monster.length-1;i>=0;i--){
            if(arr[i]>=monster[i]){
                ans-=monster[i];
            }
            else{
                ans-=arr[i];
                break;
            }
        }
        return ans;
    }
}