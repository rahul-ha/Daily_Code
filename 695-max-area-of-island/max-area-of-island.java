class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int a = help(i,j,grid);
                    ans = Math.max(a,ans);
                }
            }
        }
        return ans;
    }
    public int help(int i,int j,int grid[][]){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length|| grid[i][j]==0) return 0;
        
        grid[i][j] = 0;
      int  ans = 1+help(i+1,j,grid) +
        help(i,j+1,grid) + help(i-1,j,grid) + help(i,j-1,grid);
        return ans;
    }
}