class Solution {
    public boolean isValid(char[][] b,int i,int j,char k){
        int rows=(i/3)*3;
        int columns=(j/3)*3;
        for(int a=0;a<9;a++){
            if(b[i][a]==k) return false;
            if(b[a][j]==k) return false;
        }
        for(int row=rows;row<rows+3;row++){
            for(int column=columns;column<columns+3;column++){
                if(b[row][column]==k) return false;
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char k='1';k<='9';k++){
                        if(isValid(board,i,j,k)) {
                            board[i][j]=k;
                           if(solve(board)==true) return;
                           board[i][j]='.';
                        }
                    }
                }
            }
        }
    }
    public boolean solve(char[][] b){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(b[i][j]=='.'){
                    for(char k='1';k<='9';k++){
                        if(isValid(b,i,j,k)) {
                            b[i][j]=k;
                           if(solve(b)==true) return true;
                           b[i][j]='.';
                        }
                    }
                return false;
                }
            }
        }
        return true;
    }
}