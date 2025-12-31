class Solution {
    public boolean validPath(int n, int[][] edges, int src, int des) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i =0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int nn[]: edges){
            int a = nn[0];
            int b = nn[1];
            map.get(a).add(b);
            map.get(b).add(a);
        }
        HashSet<Integer> visited  = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int r = q.poll();
            if(visited.contains(r))
            continue;
            visited.add(r);
            if(r==des)
            return true;
            for(int nbh: map.get(r)){
                if(!visited.contains(nbh))
                q.add(nbh);
            }
        }
        return false;
    }
}