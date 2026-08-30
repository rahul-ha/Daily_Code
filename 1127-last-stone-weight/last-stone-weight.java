class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1) return stones[0];

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        
        while(!pq.isEmpty()){
            if(pq.size()==1) return pq.poll();
            int a = pq.poll();
            int b = pq.poll();
            if(a!=b){
                pq.add(a-b);
            }
        }
        if(pq.size()==0) return 0;
        return pq.poll();
    }
}