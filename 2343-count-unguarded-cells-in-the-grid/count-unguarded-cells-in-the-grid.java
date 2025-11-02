class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] arr=new int[m][n];

        for(int i=0;i<guards.length;i++){
            int j=guards[i][0];
            int k=guards[i][1];
            arr[j][k]=1;
        }
        for(int i=0;i<walls.length;i++){
            int j=walls[i][0];
            int k=walls[i][1];
            arr[j][k]=-1;
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            if (arr[i][j] == 1) {
            fill(arr, i, j + 1, 0, 1, m, n); 
            fill(arr, i, j - 1, 0, -1, m, n);
            fill(arr, i + 1, j, 1, 0, m, n); 
            fill(arr, i - 1, j, -1, 0, m, n);
            }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    count++;
                }
            }
        }
        return count;

    }
    public void fill(int[][] arr,int i,int j,int di,int dj,int m,int n){
        if(i<0||i>=m||j<0||j>=n||arr[i][j]==-1||arr[i][j]==1) return;
        arr[i][j]=2;
        fill(arr,i+di,j+dj,di,dj,m,n);
    }
}