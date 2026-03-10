class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.toLowerCase();
        StringBuilder ans = new StringBuilder();
        for(char c: ss.toCharArray()){
           if(c>='a' && c<='z' || c>='0' && c<='9') ans.append(c);
        }
        int i =0;
        int j = ans.length()-1;
        while(i<j){
            if(ans.charAt(i)==ans.charAt(j)){
                i++;
                j--;
            }
            else  return false;
        }
        return true;
    }
}