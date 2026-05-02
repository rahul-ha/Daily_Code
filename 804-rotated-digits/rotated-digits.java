class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        for(int i =0;i<=n;i++){
            if(good(i)) count++;
        }
        return count;
    }
    public boolean good(int n){
        boolean ans = false;
        while(n>1){
            int nn = n%10;
            if(nn==3 || nn==4 || nn==7) return false;
            if(nn==2 || nn==5 || nn==6 || nn==9) ans = true; 
            n = n/10;
        }
        return ans;
    }
}