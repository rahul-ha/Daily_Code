class Solution {
    public int minJumps(int[] arr) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
       if(arr.length==1) return 0;
        for(int i =0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],new ArrayList<>());
            }
            map.get(arr[i]).add(i);
        }
       
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int step = 0;
         q.add(0);
        visited.add(0);

        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                int n = q.poll();
                if(n== arr.length-1)
                return step;
                if(n-1>=0 && !visited.contains(n-1)){
                    visited.add(n-1);
                    q.add(n-1);
                }

                if(n+1< arr.length && !visited.contains(n+1)){
                      visited.add(n+1);
                    q.add(n+1);
                }

                if(map.containsKey(arr[n])){
                    for(int l : map.get(arr[n])){
                        if(!visited.contains(l)){
                            visited.add(l);
                            q.add(l);
                        }
                    }
                }
                map.remove(arr[n]);
            }
            step++;
        }

        return -1;
    }
}