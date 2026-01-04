class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder ss = new StringBuilder(s);
       String rev =  ss.reverse().toString();
        int dp[][] = new int[s.length()][s.length()];
        for(int row[]:dp)
        Arrays.fill(row,-1);
        return cal(s,rev,0,0,dp);
    }
    public static int cal(String s, String ss ,int i, int j,int dp[][]){
        if(i>=s.length() || j>=ss.length()) return 0;
        int ans = 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        if(s.charAt(i)==ss.charAt(j)){
            ans = 1+ cal(s,ss,i+1,j+1,dp);
        }
        else{
            int a = cal(s,ss,i+1,j,dp);
            int b = cal(s,ss,i,j+1,dp);
            ans =  Math.max(a,b);
        }
         return dp[i][j] = ans;
    }
}