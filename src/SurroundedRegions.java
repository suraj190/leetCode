
public class SurroundedRegions {

    public void solve(char[][] board) {

        for(int i = 0; i<board.length; i++){

            for(int j = 0; j<board[i].length; j++){

                if(board[i][j] == 'O' && (i==0 || j==0 || i==board.length-1 || j==board[i].length-1)){
                    board[i][j] = '#';
                    dfs(i, j, board);
                }
            }
        }

        for(int i = 0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){

                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                if(board[i][j] == '#'){
                    board[i][j] = 'O';
                }
            }
        }




    }

    private char[][] dfs(int i, int j,char[][] board) {

        if(i!= board.length-1 && board[i+1][j]=='O'){
            board[i+1][j] = '#';
            dfs(i+1,j,board);
        }

        if(i!=0 && board[i-1][j]=='O'){
            board[i-1][j] = '#';
            dfs(i-1,j,board);
        }

        if(j!=board[i].length-1 && board[i][j+1]=='O'){
            board[i][j+1] = '#';
            dfs(i,j+1,board);
        }

        if(j!=0 && board[i][j-1]=='O'){
            board[i][j-1] = '#';
            dfs(i,j-1,board);
        }

        return board;
    }
}
