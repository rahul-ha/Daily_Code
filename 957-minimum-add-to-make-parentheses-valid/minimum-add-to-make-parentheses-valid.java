class Solution {
    public int minAddToMakeValid(String s) {
       Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && c==')' && st.peek()=='('){
                st.pop();
            }
            else 
            st.add(c);
        }
        return st.size();
    }
}