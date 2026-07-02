class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();
        boolean[][] visited = new boolean[m][n];
        Boolean dp[][][] = new Boolean[m][n][health+1];
        return cal(grid,0,0,health,visited,dp);
    }
    public boolean cal(List<List<Integer>> grid,int i,int j,int health,boolean visited[][],Boolean dp[][][]){
        if(i<0 || j<0 || i>=grid.size() || j>= grid.get(0).size() || visited[i][j])
        return false;
        if(grid.get(i).get(j)==1)
        health = health-1;
        if(health<1) return false;

        if(i>=grid.size()-1 && j>= grid.get(0).size()-1)
        return true;

        
        if(dp[i][j][health]!=null) return dp[i][j][health];
        visited[i][j] = true;

        boolean  ans = cal(grid,i+1,j,health,visited,dp) ||
            cal(grid,i-1,j,health,visited,dp) ||
            cal(grid,i,j+1,health,visited,dp) ||
            cal(grid,i,j-1,health,visited,dp);
            
            visited[i][j]= false;
            
             return dp[i][j][health] = ans;

    }
}