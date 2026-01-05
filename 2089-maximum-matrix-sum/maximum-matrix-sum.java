class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long ans=0;
        int count=0;
        int n=matrix.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                min=Math.min(min,Math.abs(matrix[i][j]));
                ans=ans+(long)Math.abs(matrix[i][j]);
                if(matrix[i][j]<0) count++;
            }
        }
        if(count%2!=0) return ans-min-min;
        return ans;
    }
}