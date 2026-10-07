class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st  = new Stack<>();
        st.push(0);
        for(char c: s.toCharArray()){
            if(c=='(') st.push(0);
            else{
                int a = st.pop();
                int score = 0;
                if(a==0) score = 1;
                else score = a*2;
                st.push(st.pop()+score);
            }
        }
        return st.pop();
    }
}