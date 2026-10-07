class Solution {
    public String minRemoveToMakeValid(String s) {
    // StringBuilder ss  = new StringBuilder(s);
    int open = 0;
    HashSet<Integer> al = new HashSet<>();
    for(int i =0;i<s.length();i++){
        if(s.charAt(i)=='(') {
            open++;
        }
        else if(s.charAt(i)==')'){
            if(open>0){
                open--;
            }
            else al.add(i);
        }
    }
    int close = 0;
        for(int i =s.length()-1;i>=0;i--){
             if(s.charAt(i)==')') {
            close++;
        }
        else if(s.charAt(i)=='('){
            if(close>0){
                close--;
            }
            else al.add(i);
        }
        }
        StringBuilder ss  = new StringBuilder();
       
    
       for(int i =0;i<s.length();i++){
        if(!al.contains(i)) ss.append(s.charAt(i));
       }
       return ss.toString();
    }
    
    }
