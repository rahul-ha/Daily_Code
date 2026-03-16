class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i =0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==1) fresh++;
                if(grid[i][j]==2) q.add(new int[]{i,j});
            }
        }
        if(fresh==0) return 0;
        int ans = 0;
        while(!q.isEmpty()){
            int size = q.size();
            boolean n = false;
            for(int i =0;i<size;i++){
                int cur[] = q.poll();
                int dir[][]= {{1,0},{-1,0},{0,1},{0,-1}};
                for(int arr[]:dir){
                    int r = cur[0]+arr[0];
                    int c = cur[1] + arr[1];
     if(r>=0 && c>=0 && r<grid.length && c< grid[0].length && grid[r][c]==1){
        grid[r][c] = 2;
        fresh--;
        q.add(new int[]{r,c});
        n = true;
     } 
                }
            }
            if(n)ans++;
        }
        return fresh==0?ans:-1 ;
    }
}