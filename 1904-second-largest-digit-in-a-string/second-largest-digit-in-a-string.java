class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> al = new ArrayList<>();
        for(char c : s.toCharArray()){
            if("0123456789".indexOf(c)!=-1){
                int a = c-'0';
                if(!al.contains(a))
                al.add(a);
            }
        }
        Collections.sort(al);
        if(al.size()<=1)
        return -1;
        return al.get(al.size()-2);
    }
}