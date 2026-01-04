class Solution {
    public int[] findOrder(int n, int[][] pre) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i =0;i<n;i++)
        map.put(i,new ArrayList<>());
        for(int d[] : pre){
            int a = d[0];
            int b = d[1];
            map.get(b).add(a); // for directional
        }
        int in[] = new int[n];
        for(int v1 : map.keySet()){
            for(int v2 : map.get(v1))
            in[v2]++;
        }
        int arr[] = new int[n];
        int j = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<n;i++){
            if(in[i]==0)
            q.add(i);
        }
        while(!q.isEmpty()){
            int r = q.poll();
            arr[j++] = r;
            for(int nn: map.get(r)){
                in[nn]--;
                if(in[nn]==0)
                q.add(nn);
            }
        }
        if(j!=n) return new int[0];
        return arr;
    }
}