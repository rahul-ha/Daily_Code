class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        for(int i =1;i<words.length;i++){
            if(groups[i-1]!=groups[i])
            ans.add(words[i]);
            else 
            continue;
        }
        return  ans;
    }
}