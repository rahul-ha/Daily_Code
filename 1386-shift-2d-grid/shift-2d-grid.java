class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        
        // Optimize k to avoid unnecessary full rotations
        k = k % total;
        
        // If k is 0, return the grid as-is
        if (k == 0) {
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                List<Integer> row = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    row.add(grid[i][j]);
                }
                result.add(row);
            }
            return result;
        }
        
        // Flatten the grid into a 1D array
        int[] flat = new int[total];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                flat[i * n + j] = grid[i][j];
            }
        }
        
        // Build the result by placing elements at shifted positions
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int originalIndex = (i * n + j - k + total) % total;
                row.add(flat[originalIndex]);
            }
            result.add(row);
        }
        
        return result;
    }
}