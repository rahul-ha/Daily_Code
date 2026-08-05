class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] arr) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int indeg[] = new int[n];
        List<Integer> ans = new ArrayList<>();
        for(int i =0;i<n;i++){
            map.put(i,new ArrayList<>());
            ans.add(i);
        }
        for(int i = 0;i<arr.length;i++){
            int a= arr[i][0];
           int b = arr[i][1];
            indeg[b]++;
            map.get(a).add(b);
        }
      HashSet<Integer> visited = new HashSet<>();
      boolean b[] = new boolean[n];
      Queue<Integer> q = new LinkedList<>();
      q.add(k);
      b[k] = true;
      while(!q.isEmpty()){
        int a = q.poll();
        if(visited.contains(a)){
            continue;
        }
        visited.add(a);
        b[a] = true;
        for(int al : map.get(a)){
            if(!visited.contains(al))
            q.add(al);
            indeg[al]--;
        }
      }
    
      List<Integer> al = new ArrayList<>();
      for(int i =0;i<n;i++){
        if(b[i]==true && indeg[i]>0){
            return ans;
        }
        else if(b[i]==false) al.add(i);
        else continue;
      }
      return al;
    }
}