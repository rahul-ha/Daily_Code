class Solution {
    public int networkDelayTime(int[][] arr1, int n, int k) {
        HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
        for(int i =1;i<=n;i++)
         map.put(i,new HashMap<Integer,Integer>());
         for(int row[]: arr1){
            int v1 = row[0];
            int v2 = row[1];
            int cost = row[2];
            map.get(v1).put(v2,cost);
         }
         int arr[] = new int[n];
         Arrays.fill(arr,Integer.MAX_VALUE);
         arr[k-1] = 0;
         PriorityQueue<int[]> q = new PriorityQueue<>((a,b)-> Integer.compare(a[1],b[1]));
         q.add(new int[]{k,0});
         HashSet<Integer> visited = new HashSet<>();
         while(!q.isEmpty()){
            int row[] = q.poll();
            int vtr = row[0];
            int cost = row[1];
            if(visited.contains(vtr))
            continue;
            visited.add(vtr);
            for(Map.Entry<Integer,Integer> e : map.get(vtr).entrySet()){
                int newcost = cost+ e.getValue();
                int nv = e.getKey();
                if(newcost < arr[nv-1]){
                    arr[nv-1] = newcost;
                    q.add(new int[]{nv,newcost});
                }
            }
         }
         int max = Integer.MIN_VALUE;
         for(int nn:arr){
            if(nn==Integer.MAX_VALUE)
            return -1;
            if(nn>max)
            max = nn;
         }
        return max;
    }
}