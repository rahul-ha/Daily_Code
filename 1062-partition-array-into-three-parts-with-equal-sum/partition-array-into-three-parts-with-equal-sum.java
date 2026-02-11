class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i =0;i<arr.length;i++)
        sum+=arr[i];
        if(sum%3!=0) return false;
        int tar = sum/3;
        int ans = 0;
        int prefix = 0;
        int count = 0;
        for(int i =0;i<arr.length-1;i++){
            prefix +=arr[i];
            if(prefix== 2*tar) ans+=count;
            if(prefix == tar) count++;

        }
        if(ans>=1) return true;
        return false;
    }
}