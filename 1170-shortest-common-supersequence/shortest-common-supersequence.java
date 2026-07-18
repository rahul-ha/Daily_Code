class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
        String dp [][] = new String[s1.length()][s2.length()];

        String lcs = cal(s1,s2,0,0,dp);
        StringBuilder ans = new StringBuilder();
        int i =0;
        int j = 0;
        for(char c : lcs.toCharArray()){
            while(s1.charAt(i)!=c){
                ans.append(s1.charAt(i));
                i++;
            }
            while(s2.charAt(j)!=c){
                ans.append(s2.charAt(j));
                j++;
            }
            ans.append(c);
            i++;
            j++;
        }
        ans.append(s1.substring(i));
        ans.append(s2.substring(j));
        return ans.toString();
    }

    public String cal(String s1, String s2,int i ,int j, String dp [][]){
        if(i==s1.length() || j== s2.length())
        return "";
        if(dp[i][j]!=null) return dp[i][j];
        if(s1.charAt(i)== s2.charAt(j)){
            return   dp [i][j] = s1.charAt(i)+ cal(s1,s2,i+1,j+1,dp);
        }
        String a =  cal(s1,s2,i+1,j,dp);
        String b = cal(s1,s2,i,j+1,dp);
        if(a.length()>=b.length())
        return  dp [i][j] = a;
        else return  dp [i][j] = b;
    }
}