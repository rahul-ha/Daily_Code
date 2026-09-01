class Solution {
    public int findMaxForm(String[] s, int m, int n) {
        int dp[][][] = new int[s.length][m+1][n+1];
        for(int i =0;i<s.length;i++){
            for(int j =0;j<=m;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return solve(s,0,m,n,dp);
    }
    public int solve(String[] s,int i,int m,int n,int dp[][][]){
        if(i==s.length || m<0 || n<0)
            return 0;

            if(dp[i][m][n]!=-1) return dp[i][m][n];
            
            int zeros =0;
            int one = 0;
            for(char c:s[i].toCharArray()){
                if(c=='0') zeros++;
                else one++;
            }
            int pick = 0;
            if(m>=zeros && n>= one){
                pick = 1+solve(s,i+1,m-zeros,n-one,dp);
            }
            int notpick = solve(s,i+1,m,n,dp);
            return dp[i][m][n] = Math.max(pick,notpick);
        }
    
    }