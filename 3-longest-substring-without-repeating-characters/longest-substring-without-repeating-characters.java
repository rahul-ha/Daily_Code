class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int count = 0;
         int k = 0;
        for(char c: s.toCharArray()){
            if(!set.contains(c)){
                count++;
                set.add(c);
            }
            else{ 
                while(set.contains(c)){
                    set.remove(s.charAt(k));
                    k++;
                    count--;
                }
                set.add(c);
                count++;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}