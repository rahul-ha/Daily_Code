class Solution {
    public boolean sumGame(String num) {
      int ls = 0;
      int rs = 0;
      int cl = 0;
      int cr = 0;
      for(int i =0;i<num.length();i++){
        if(i< num.length()/2){
            if(num.charAt(i)!='?'){
                ls = ls+ num.charAt(i) -'0';
            }
            else cl++;
        }
        else{
            if(num.charAt(i)!='?'){
                rs = rs+ num.charAt(i) -'0';
            }
            else cr++;
        }
      }
      if((cl+cr)%2!=0) return true;
      if(ls+ 4.5*cl == rs+4.5*cr) return false;
      return true;
    }
}