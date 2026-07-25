class Solution {
    public boolean isPerfectSquare(int num) {
        boolean ans = false;
        long n = num;
        long  i =1;
        long  j =  num;
        while(i<=j){
            long mid = (i+j)/2;
            if(mid*mid == n){
                ans = true;
                break;
            }
            else if(mid*mid<n){
                i = mid+1;
            }
            else {
                j = mid-1;
            }
        }
        return ans;
    }
}