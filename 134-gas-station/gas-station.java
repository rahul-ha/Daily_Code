class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int in = 0;
        int go = 0;
        for(int i =0;i<gas.length;i++){
            in+=gas[i];
            go+=cost[i];
        }
        if(go>in) return -1;
       int ans = 0;
       int sum = 0;
        for(int i = 0;i<gas.length-1;i++){
            sum += gas[i] -cost[i];
            if(sum<0){
                sum = 0;
                ans = i+1;
            }
           
        }
         return ans;
    }
}