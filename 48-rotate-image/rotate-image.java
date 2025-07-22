class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0;
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            int k=m-1;
            for(int j=0;j<m;j++){
                arr[i][j]=matrix[k--][l];
            }
            l++;
        }
       for (int i = 0; i < arr.length; i++) {
      matrix[i] = Arrays.copyOf(arr[i], arr[i].length);
        }
        // System.out.print(Arrays.deepToString(arr));
    }
}