class Solution {
    public String reverseParentheses(String k) {
        Stack<Integer> st = new Stack<>();
        StringBuilder s =  new StringBuilder();
        for(char c: k.toCharArray()){
            if(c=='('){
                st.add(s.length());
                
                }
            else if(c==')'){
                reverse(s,st.pop(),s.length()-1);
            }
            else 
            s.append(c);
        }
        return s.toString();
    }
    public void reverse(StringBuilder s , int i,int j){
        while(i<=j){
          char c =  s.charAt(i);
          s.setCharAt(i,s.charAt(j));
          s.setCharAt(j,c);
          i++;j--;
        }
    }
}