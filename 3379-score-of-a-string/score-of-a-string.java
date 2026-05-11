class Solution {
    public int scoreOfString(String s) {
        int count =0;
        char c = s.charAt(0);
        for(int i =1;i<s.length();i++){
            count+= Math.abs(s.charAt(i)-c);
            c = s.charAt(i);
        }
        return count;
     
    }
}