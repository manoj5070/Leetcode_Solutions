class Solution {
    public int minOperations(int[][] grid, int x) {
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        int[] arr=new int[m*n];
        int len=arr.length;
        int ind=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[ind++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        int num=arr[len/2];
        for(int i=0;i<len;i++){
            int diff=Math.abs(num-arr[i]);
            // System.out.print(diff);
            if(diff%x==0){
               ans+=diff; 
            // System.out.print(ans);

            }else return -1;
        }
        return ans/x;
    }
}