class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        int count  = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<arr.length;i++){
            q.add(i);
        }
        while(!q.isEmpty()){
            int a = q.poll();
            arr[a] = arr[a]-1;
            count++;
            if(arr[a]!=0)
            q.add(a);
            if(arr[k]==0)
            break;

        }
        return count;
    }
}