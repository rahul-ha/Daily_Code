class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count = 0;
        for(char c : s.toCharArray()){
            int a  = map.get(c);
            if(a==1) return count;
            count++;
        }
        return -1;
    }
}