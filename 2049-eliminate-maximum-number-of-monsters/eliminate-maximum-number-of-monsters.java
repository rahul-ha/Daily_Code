class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int time[] = new int[dist.length];
        for(int i =0;i<dist.length;i++){
            time[i] = (int)Math.ceil((double)dist[i]/speed[i]);
        }
        int count = 1;
        Arrays.sort(time);
        for(int i =1;i<dist.length;i++){
            if(time[i]-i<=0) break;
            count++;
        }
        return count;
    }
}