class Solution {
    public void solve(char[][] board) {
        Queue<int[]> q =  new LinkedList<>();
        int n = board.length;
        int m =  board[0].length;
        for(int i =0;i<n;i++){
            if(board[i][0]=='O'){
            q.add(new int[]{i,0});
            board[i][0] = '#';
            }
           
            if(board[i][m-1]=='O'){
             q.add(new int[]{i,m-1});
             board[i][m-1] = '#';
            }
           
        }
        for(int i = 0;i<m;i++){
            if(board[0][i]=='O'){
                 q.add(new int[]{0,i});
                 board[0][i] = '#';
            }
           
            if(board[n-1][i]=='O'){
                 q.add(new int[]{n-1,i});
                 board[n-1][i] = '#';
            }
           
        }
        int dir[][] = {{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int row[] = q.poll();
            int r = row[0];
            int c = row[1];
            for(int d[]:dir){
                int rr = r+d[0];
                int rc = c+d[1];
                if(rr>0 && rc>0 && rr<n-1 && rc<m-1 && board[rr][rc]=='O'){
                    board[rr][rc] = '#';
                    q.add(new int[]{rr,rc});
                }
            }
        }
        for(int  i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(board[i][j]=='#')
                board[i][j] = 'O';
                else
                board[i][j] = 'X';
            }
        }
    }
}