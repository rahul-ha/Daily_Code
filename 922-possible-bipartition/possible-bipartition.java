class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        Queue< int[]> q = new LinkedList<>();
        HashMap<Integer,Integer> visited = new HashMap<>();
        for(int i = 1;i<=n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int arr[] : dislikes){
           int v1 = arr[0];
           int v2 = arr[1];
                map.get(v1).add(v2);
                map.get(v2).add(v1);
            
        }
        for(int i =1;i<=n;i++){
            if(visited.containsKey(i))
            continue;
            q.add(new int[]{i,0});
            while(!q.isEmpty()){
                int row[] = q.poll();
                int vtr = row[0];
                int dis = row[1];
                if(visited.containsKey(vtr)){
                    if(visited.get(vtr)!= dis)
                    return false;
                }
                visited.put(vtr,dis);
                for(int k : map.get(vtr)){
                   if(!visited.containsKey(k))
                   q.add(new int[]{k,dis+1});
                }
            }
        }

return true;
    }
}