class Solution {
    public int countBattleships(char[][] board) {
        int count  = 0;
        for(int i=0;i<board.length;i++){
            for(int j =0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    cal(board,i,j);
                    count++;
                }
            }
        }
        return count;
    }

        public void cal(char board[][],int i,int j){
            if(i>=board.length || j>=board[0].length || i<0 || j<0 || board[i][j]=='.')
            return ;

            board[i][j] = '.';
            cal(board,i+1,j);
            cal(board,i,j+1);
            cal(board,i-1,j);
            cal(board,i,j-1);
        }

    
}