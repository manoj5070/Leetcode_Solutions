class Solution {
    int[][] dimentions=new int[][]{{1,1},{1,-1},{-1,-1},{-1,1}};
    int m,n=0;
    public int lenOfVDiagonal(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        int max=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    for(int d=0;d<4;d++){
                        max=Math.max(max,1+solve(i,j,d,true,2,grid));
                    }
                }
            }
        }
        return max==-1?0:max;
    }
    public int solve(int i,int j,int d,boolean canTurn,int value,int[][] grid){
        int i_=i+dimentions[d][0];
        int j_=j+dimentions[d][1];
        if(i_<0||i_>=n||j_<0||j_>=m||grid[i_][j_]!=value) return 0;
        int result=0;

        int keepMoving=1+solve(i_,j_,d,canTurn,value==2?0:2,grid);
        result=Math.max(result,keepMoving);
        if(canTurn) {
            int turn=1+solve(i_,j_,(d+1)%4,false,value==2?0:2,grid);
            result=Math.max(turn,result);
        }
        return result;
    }
}