class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=0;i<=n;i++){
            int a =  cal(i);
            ans[i] = a;
        }
        return ans;

    }
    public int cal(int n){
        int ans = 0;
        while(n>0){
            if(n%2!=0) ans++;
            n = n/2;
        }
        return ans;
    }
}