class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int arr[] = new int[26];
        int arr2[] = new int[26];
        for(char k : p.toCharArray()){
            arr[k-'a']++;
        }
       int i  =0;
       for(int j = 0;j<s.length();j++){
        char k = s.charAt(j);
        arr2[k-'a']++;
        if(j-i+1>p.length()){
            arr2[s.charAt(i)-'a']--;
            i++;
        }
        if(Arrays.equals(arr,arr2))
        ans.add(i);
       }
        return ans;
    }
}