class Solution {
    public int minLength(String s) {
        StringBuilder ss = new StringBuilder();
        for(char c : s.toCharArray()){
            int  l = ss.length();
            if(l>0 && (ss.charAt(l-1) =='A' && c=='B'))
            ss.deleteCharAt(l-1);
            else if(l>0 && (ss.charAt(l-1) =='C' && c=='D'))
            ss.deleteCharAt(l-1);
            else 
            ss.append(c);
        }
        return ss.length();
    }
}