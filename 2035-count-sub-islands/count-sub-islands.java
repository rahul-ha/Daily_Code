class Solution {
    boolean a = true;
    public int countSubIslands(int[][] grid, int[][] grid2) {
        int ans = 0;
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid2[i][j]==1){
                    a = true;
                    cal(i,j,grid2,grid);
                    if(a==true)
                    ans++;
                }
            }
        }
        return ans;
        
    }
      public void cal(int i, int j , int grid2[][],int grid[][]){
        if(i<0 || j<0 || i==grid2.length || j== grid2[0].length || grid2[i][j]==0)
        return;
        if(grid2[i][j]!=grid[i][j]) 
        a = false;
        grid2[i][j] = 0;
        cal(i+1,j,grid2,grid);
        cal(i,j+1,grid2,grid);
        cal(i-1,j,grid2,grid);
        cal(i,j-1,grid2,grid);
    }
}