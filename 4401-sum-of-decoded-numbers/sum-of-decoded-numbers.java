class Solution {
    public int sumDecoded(long[] nums) {
        long ans = 0;
        long arr[] = new long[nums.length];
        for(int i =0;i<nums.length;i++){
            long a = nums[i];
            long wid = a%10;
            long di = (long)Math.floor(a/10);
            String s = ""+di;
            String k = ""; 
            String jj = "";
            for(int j =0;j<wid;j++){
                k = k+s.charAt(j);
            }
            for(int j = (int)wid;j<s.length();j++){
                jj = jj+s.charAt(j);
            }
            long x = Long.parseLong(k);
            long y = Long.parseLong(jj);
           // long l =(long) Math.pow(x,y);
            long l = power(x,y);
            
            arr[i] = l;
        }
        for(int i =0;i<nums.length;i++){
            ans = ans+arr[i];
            ans = ans%1000000007;
        }
        return (int)ans;
    }
    public static long power(long a, long b){
        long ans = 1;
        while(b>0){
            if((b&1)==1)
            ans = (ans*a)%1000000007;
            a = (a*a)%1000000007;
            b = b/2;
        }
        return ans;
    }
}