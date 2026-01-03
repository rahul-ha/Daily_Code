class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int dp[][] = new int[t1.length()][t2.length()];
        for(int row[]: dp){
            Arrays.fill(row,-1);
        }
        return cal(t1,t2,0,0,dp);
    }
    public static int  cal(String t1,String t2,int i ,int j,int dp[][]){
            if(i>=t1.length()|| j>=t2.length())
            return 0;
            if(dp[i][j]!=-1)
            return dp[i][j];
            int ans =0;
            if(t1.charAt(i) == t2.charAt(j)){
                ans = 1+ cal(t1,t2,i+1,j+1,dp);
            }
            else{
            int a = cal(t1,t2,i+1,j,dp);
            int b = cal(t1,t2,i,j+1,dp);
            ans = Math.max(a,b);}

            return dp[i][j] = ans;
    }
}