class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m =  grid[0].length;
        int total = 0;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j]==1)
                total++;
            }
        }
        Queue<int []> q =  new LinkedList<>();
        for(int i =0;i<n;i++){
            if(grid[i][0]==1){
            q.add(new int[]{i,0});
            grid[i][0]=0;
            }
            if(grid[i][m-1]==1){
             q.add(new int[]{i,m-1});
             grid[i][m-1] = 0;
            }
           
        }
         for(int i =0;i<m;i++){
            if(grid[0][i]==1){
                q.add(new int[]{0,i});
                grid[0][i] = 0;
            }
            
            if(grid[n-1][i]==1){
                q.add(new int[]{n-1,i});
                grid[n-1][i] = 0;
            }
            
        }
        int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        int count = 0;
       while(!q.isEmpty()){
        int cur[] = q.poll();
        int r = cur[0];
        int c = cur[1];
        count++;
        for(int d[]:dir){
            int rr = r+d[0];
            int rc = c+d[1];
            if(rr>=0 && rc>=0 && rc<m && rr<n && grid[rr][rc]==1){
                grid[rr][rc] = 0;
                q.add(new int[]{rr,rc});
                
            }
        }
       } 
       return total-count;
    }
}