class Solution {
    public long maximumSubsequenceCount(String t1, String t2) {
        long ans = 0;
        long ans1 = 0;
        long c = 0;
        String s1 =  t2.charAt(0) + t1;
        String s2 = t1 + t2.charAt(1);
        for(int i =0;i<s1.length();i++){
            if(s1.charAt(i)== t2.charAt(0))
            c++;
            else if(s1.charAt(i)== t2.charAt(1))
            ans+=c;
        }
        if(t2.charAt(0)==t2.charAt(1))
        ans = (c*(c-1))/2;
        c = 0;

        for(int i = s1.length()-1;i>=0;i--){
            if(s2.charAt(i)==t2.charAt(1))
            c++;
            else if(s2.charAt(i)==t2.charAt(0))
            ans1+=c;
        }
          if(t2.charAt(0)==t2.charAt(1))
        ans1 = (c*(c-1))/2;

        return Math.max(ans,ans1);

    }
}