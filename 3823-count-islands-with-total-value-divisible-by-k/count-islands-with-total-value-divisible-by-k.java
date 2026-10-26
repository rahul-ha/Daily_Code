class Solution {
    public int countIslands(int[][] grid, int k) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                 if (grid[i][j] != 0) { 
                    long a = cal(grid, i, j, n, m);
                    if (a % k == 0) ans++;
                }
            }
        }
        return ans;
    }
    public long cal(int grid[][],int i ,int j,int n,int m){
        if (i >= n || j >= m || i < 0 || j < 0 || grid[i][j] == 0) return 0;

        long ans = grid[i][j];
        grid[i][j] = 0;

        ans += cal(grid, i + 1, j, n, m);
        ans += cal(grid, i, j + 1, n, m);
        ans += cal(grid, i - 1, j, n, m);
        ans += cal(grid, i, j - 1, n, m);

        return ans;
    }
}