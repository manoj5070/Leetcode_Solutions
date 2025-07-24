class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    isPresent(grid,i,j,m,n);
                    c++;
                }
            }
        }
        return c;
    }
    private void isPresent(char[][] arr,int i,int j,int m,int n){
        if(i<0||i>=m||j<0||j>=n || arr[i][j]=='0')  return;
        arr[i][j]='0';
        isPresent(arr,i,j-1,m,n);
        isPresent(arr,i,j+1,m,n);
        isPresent(arr,i-1,j,m,n);
        isPresent(arr,i+1,j,m,n);
        return;
    } 
}