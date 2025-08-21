class Solution {
    public int countSquares(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int sum=0;
        int[][] dp=new int[rows+1][columns+1];

        for(int i=0;i<rows;i++){
            Arrays.fill(dp[i],-1);
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sum+=f(matrix,i,j,dp);
            }
        }
        return sum;
    }
    public int f(int[][] arr,int i,int j,int[][] dp){
        if(i==arr.length || j==arr[0].length) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(arr[i][j]==0) return 0;
        int right=f(arr,i,j+1,dp);
        int diagonal=f(arr,i+1,j+1,dp);
        int below=f(arr,i+1,j,dp);
        return dp[i][j]=1+Math.min(right,Math.min(diagonal,below));
    }
}