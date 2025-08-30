class Solution {
    public boolean isValidSudoku(char[][] board) {
       for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            char ch=board[i][j];
            if(ch=='.') continue;
            int row=(i/3)*3;
            int column=(j/3)*3;
            for(int k=row;k<3+row;k++){
                for(int l=column;l<3+column;l++){
                    if(i==k && j==l) continue;
                    if(ch==board[k][l]) return false;
                }
            }
            for(int k=i+1;k<9;k++){
                if(board[k][j]==ch) return false;
            }

            for(int k=j+1;k<9;k++){
                if(board[i][k]==ch) return false;
            }
        }
       } 
       return true;
    }
}