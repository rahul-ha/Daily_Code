class Solution {
    public int longestSubstring(String s, int k) {

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            int[] freq = new int[26];

            for (int j = i; j < s.length(); j++) {

                int idx = s.charAt(j) - 'a';
                freq[idx]++;

                // Check whether current substring is valid
                boolean valid = true;

                for (int x = 0; x < 26; x++) {
                    if (freq[x] > 0 && freq[x] < k) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }
}