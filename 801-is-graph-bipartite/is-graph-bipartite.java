class Solution {
    public boolean isBipartite(int[][] graph) {
        HashMap<Integer,Integer> visited = new HashMap<>();
        Queue<int[]> q = new LinkedList<>();
        for(int i =0;i<graph.length;i++){
            if(visited.containsKey(i))
            continue;
             q.add(new int[]{i,0});
             while(!q.isEmpty()){
                int r[] = q.poll();
                int vtr = r[0];
                int dis = r[1];

                if(visited.containsKey(vtr)){
                    if(visited.get(vtr ) != dis)
                    return false;
                    //continue;
                }
                visited.put(vtr,dis);
                for(int s: graph[vtr]){
                    if(!visited.containsKey(s))
                    q.add(new int[]{s,dis+1});
                }
             }

        }
return true;
    }
}