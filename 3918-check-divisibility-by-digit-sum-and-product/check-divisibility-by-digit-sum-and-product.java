class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int k = n;
        while(n>0){
            int a = n%10;
            sum+=a;
            product = product*a;
            n = n/10;
        }
        int ans = sum+product;
        return k%ans==0;
    }
}