class Solution {
    public int findChampion(int n, int[][] edges) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0;i<n;i++)
        map.put(i, new ArrayList<>());

        for(int row[]: edges){
            int a = row[0];
            int b = row[1];
            map.get(a).add(b);
        }
        int in[] = new int[n];
        int min = Integer.MAX_VALUE;
        for(int v1 : map.keySet()){
            for(int v2 : map.get(v1)){
                in[v2]++;
            }
        }
        int ans = 0;
         for(int i =0;i<n;i++){
            if(min>in[i]){
                min = in[i];
                ans = i;
            }

            //min = Math.min(min,in[i]);

        }
        
        int count = 0;
        for(int i =0;i<n;i++){
            if(min==in[i])
            count++;
        }
       
       if(count==1)
       return ans;
       return -1;

    }
}