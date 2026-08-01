class Solution {
    public String findCommonResponse(List<List<String>> res) {
        HashMap<String,Integer> map = new HashMap<>(); 
        for(List<String> al : res ){
            HashSet<String> set = new HashSet<>();
            for(String a : al){
                if(!set.contains(a)){
                    map.put(a,map.getOrDefault(a,0)+1);
                    set.add(a);
                }
            }
        }
        int max = 0;
        for(String s : map.keySet()){
            max = Math.max(max,map.get(s));
        }
        String ans = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        for(String s : map.keySet()){
            if(map.get(s)==max){
                if(s.compareTo(ans)<0)
                ans = s;
            }
        }
        return ans;
    }
}