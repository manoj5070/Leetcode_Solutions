class Solution {
    int min=-1000000000;
    int[][] dp=new int[501][501];
    
    public int maxDotProduct(int[] nums1, int[] nums2) {
        for(int i=0;i<501;i++){
        for(int j=0;j<501;j++){
            dp[i][j]=min;
        }
        }
        return solve(nums1,nums2,0,0);
    }
    public int solve(int[] nums1,int[] nums2,int i,int j){
        if(i==nums1.length || j==nums2.length) return min;
        if(dp[i][j]!=min) return dp[i][j];
        int val=nums1[i]*nums2[j];
        int next=nums1[i]*nums2[j]+solve(nums1,nums2,i+1,j+1);
        int increase_i=solve(nums1,nums2,i+1,j);
        int increase_j=solve(nums1,nums2,i,j+1);
        return dp[i][j]=Math.max(val,Math.max(next,Math.max(increase_i,increase_j)));
    }
}