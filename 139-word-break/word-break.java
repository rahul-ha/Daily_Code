class Solution {
    public boolean wordBreak(String s, List<String> word) {
        HashSet<String> set = new HashSet<>(word);
        Boolean dp[] = new  Boolean[s.length()];
        return cal(s,set,0,dp);
    }
    public boolean cal(String s, HashSet<String> set,int i,Boolean dp[]){
        if(i==s.length()) return true;
        if(dp[i]!=null) return dp[i];
        for(int j = i;j<=s.length();j++){
            String a = s.substring(i,j);
            if(set.contains(a) && cal(s,set,j,dp)){
                return dp[i] =  true;
            }
        }
        return dp[i] =  false;
    }
}