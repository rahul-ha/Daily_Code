class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int c =0;
        int ans = 0;
        for(int i = cost.length-1;i>=0;i--){
            if(c==2){
                c = 0;
            }
            else{
                ans += cost[i];
                c++;
            }
        }
        return ans;
    }
}