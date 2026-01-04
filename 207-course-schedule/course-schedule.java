class Solution {
    public boolean canFinish(int n, int[][] pre) {
        HashMap<Integer, ArrayList<Integer>> map =  new HashMap<>();
        for(int i =0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int arr[]: pre){
            int a = arr[0];
            int b = arr[1];
            map.get(a).add(b);
        }
        int in[] = new int[n];
        for(int v1 : map.keySet()){
            for(int v2 : map.get(v1))
            in[v2]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<n;i++){
            if(in[i]==0)
            q.add(i);
        }
        int count = 0;
        while(!q.isEmpty()){
            int r = q.poll();
            count++;
            for(int d : map.get(r)){
                in[d]--;
                if(in[d]==0)
                q.add(d);
            }
        }
        return count== n;
    }
}