class Solution {
    public int smallestNumber(int n, int t) {
        int ans = n;
       for(int i =n;i<=100;i++){
        int get = cal(i);
        if(get%t==0) return ans;
        else ans++;
       }
       return 0;
    }
    public int cal(int n){
        int a = 1;
        while(n>0){
            int b = n%10;
            a = a*b;
            n = n/10;
        }
        return a;
    }
}