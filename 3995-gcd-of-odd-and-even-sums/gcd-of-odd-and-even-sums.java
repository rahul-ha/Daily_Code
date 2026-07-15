class Solution {
    public int gcdOfOddEvenSums(int n) {
        int o =1;
        int e = 2;
        int odd = 0;
        int even = 0;
        for(int i =1;i<=n;i++){
            odd+= o;
            even+=e;
            o+=2;
            e+=2;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 1; i<=Math.min(odd,even);i++){
            if(odd%i==0 && even%i==0){
                max = Math.max(i,max);
            }
        }
        return max;

        
    }
}