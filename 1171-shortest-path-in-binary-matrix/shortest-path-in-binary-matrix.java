class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0]!=0 || grid[n-1][n-1]!=0) return -1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,1});
        boolean arr[][] = new boolean[n][n];
        int dir[][] = {{1,0},{0,1},{-1,0},{0,-1},{1,1},{-1,-1},{-1,1},{1,-1}};
        while(!q.isEmpty()){
            int row[] = q.poll();
            int i = row[0];
            int j = row[1];
            int cost = row[2];
            if(i==n-1 && j==n-1)
            return cost;
            if(arr[i][j])
            continue;
            arr[i][j] = true;
            for(int d[]: dir){
                int r = i+d[0];
                int c = j+d[1];
        if(r>=0 && c>=0 &&  r<n && c<n && grid[r][c]==0 && !arr[r][c]){
            q.add(new int[]{r,c,cost+1});
        }}
        }
        return -1;
    }
}