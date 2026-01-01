class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i =1;i<=edges.length+1;i++){
            map.put(i,new ArrayList<>());
        }
        for(int n[]: edges){
            int a = n[0];
            int b = n[1];
            map.get(a).add(b);
            map.get(b).add(a);
        }
        for(int  n: map.keySet()){
            List<Integer> al = map.get(n);
            if(al.size()==edges.length)
            return n;
        }
        return -1;
    }
}