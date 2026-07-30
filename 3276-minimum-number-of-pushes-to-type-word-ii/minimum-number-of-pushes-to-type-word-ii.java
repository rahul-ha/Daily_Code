class Solution {
    public int minimumPushes(String word) {
        Integer arr[] = new Integer[26];
        Arrays.fill(arr, 0);
        for(char w : word.toCharArray()){
            arr[w-'a']++;
        }
        int ans = 0;
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i =0;i<26;i++){
           ans = ans + (arr[i]*((i/8)+1));
        }
        return ans;

    }
}