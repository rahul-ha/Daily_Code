class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int co = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                if(co>0){
            result.append(c);
                }
                co++;
            }
             
             else {
                co--;
                if(co>0)
                result.append(c);
             }

              }
              return result.toString();
    }
}