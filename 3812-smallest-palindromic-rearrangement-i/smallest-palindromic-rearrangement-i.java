class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder ss = new StringBuilder();
        for(int i =0;i<s.length()/2;i++){
            ss.append(s.charAt(i));
        }
        char c [] = ss.toString().toCharArray();
        Arrays.sort(c);
        StringBuilder ans = new StringBuilder(new String(c));
        StringBuilder rev = new StringBuilder(ans);
         rev.reverse();
        if(s.length()%2==1)
        ans.append(s.charAt(s.length()/2));

        ans.append(rev);
        return ans.toString();



       
    }
}