class Solution {
    public int[][] updateMatrix(int[][] mat) {
       int n = mat.length; 
       int m = mat[0].length;
       int arr[][] = new int[n][m];
       HashSet<Integer> visited = new HashSet<>();
       Queue<int []> q = new LinkedList<>();
       for(int i =0;i<n;i++){
        for(int j = 0;j<m;j++){
            if(mat[i][j]==0){
                q.add(new int[]{i,j});
                arr[i][j] = 0;
            }
            else
            arr[i][j] = -1;
        }
       }
       int chal[][] = {{1,0},{-1,0},{0,1},{0,-1}};
       while(!q.isEmpty()){
        int aa[] = q.poll();
        int r = aa[0];
        int c = aa[1];
        for(int nn[]:chal){
            int rr = r+nn[0];
            int rc = c+nn[1];
            if(rr>=0 && rc>=0 && rr<n && rc<m && arr[rr][rc]==-1){
                arr[rr][rc] = arr[r][c]+1;
                q.add(new int[]{rr,rc});
            }
        }
       }
       return arr;
    }
}