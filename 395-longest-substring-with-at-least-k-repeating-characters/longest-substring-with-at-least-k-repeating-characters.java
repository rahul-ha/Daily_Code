class Solution {
    public int longestSubstring(String s, int k) {

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            int[] freq = new int[26];
            int invalid = 0;

            for (int j = i; j < s.length(); j++) {

                int idx = s.charAt(j) - 'a';

                // Before increasing frequency
                if (freq[idx] > 0 && freq[idx] < k) {
                    invalid--;
                }

                freq[idx]++;

                // After increasing frequency
                if (freq[idx] < k) {
                    invalid++;
                }

                // Every character has frequency >= k
                if (invalid == 0) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }
}