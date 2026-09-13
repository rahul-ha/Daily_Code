class Solution {
    public int minTimeToType(String word) {
        int ans = 0;
        char k = 'a';
        for(char c : word.toCharArray()){  
           int diff = Math.abs(c - k);
            int cir = 26 - diff;
            int a = Math.min(diff, cir);
            ans+=a;
            k = c;
        }
        return ans+word.length();
    }
}