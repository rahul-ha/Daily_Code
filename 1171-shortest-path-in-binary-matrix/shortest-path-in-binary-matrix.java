class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0]!=0 || grid[n-1][n-1]!=0) return -1;

        int arr[][] = new int[n][n];
        for(int row[]:arr){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        int dir[][] = {{1,0},{0,1},{-1,0},{0,-1},{1,1},{-1,-1},{-1,1},{1,-1}};
        arr[0][0] = 1;
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)-> Integer.compare(a[2],b[2]));
        boolean b[][] = new boolean[n][n];
        q.add(new int[]{0,0,1});
        while(!q.isEmpty()){
            int row[] = q.poll();
            int i = row[0];
            int j =row[1];
            int cost = row[2];
            if(b[i][j])
            continue;
            b[i][j] = true;
            for(int d[] : dir){
                int r = i+d[0];
                int c = j+d[1];
                if(r>=0 && c>=0 &&  r<n && c<n && grid[r][c]==0 && !b[r][c]){
                    int newcost = cost+1;
                    if(newcost<arr[r][c]){
                        arr[r][c] = newcost;
                        q.add(new int[]{r,c,arr[r][c]});
                    }
        }
            }
        }
return arr[n-1][n-1] == Integer.MAX_VALUE ? -1 : arr[n-1][n-1];

    }
}