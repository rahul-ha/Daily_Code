class Solution {
    public boolean checkValidString(String s) {
        Boolean dp[][] = new Boolean[s.length()+1][s.length()+1];
       return cal(s,0,0,dp);

    }
    public boolean cal(String s, int i,int open,Boolean dp[][]){
        if(open < 0) return false;
        if(i==s.length()){
            return open == 0;
        }
        if(dp[i][open]!=null) return dp[i][open];

        boolean c = false;
        if(s.charAt(i)=='('){
            c = cal(s,i+1,open+1,dp);
        }
        else if(s.charAt(i)=='*'){
            c = cal(s,i+1,open+1,dp) ||  cal(s,i+1,open,dp) || cal(s,i+1,open-1,dp);
        }
        else if( s.charAt(i)==')')  c = cal(s,i+1,open-1,dp);
        return  dp[i][open] = c;
    }
}