class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : arr){
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String ss = new String(c);
            if(!map.containsKey(ss)){
                map.put(ss,new ArrayList<>());
            }
            map.get(ss).add(s);
        }
        for(List<String> al : map.values()){
            ans.add(al);
        }
        return ans;
    }
}