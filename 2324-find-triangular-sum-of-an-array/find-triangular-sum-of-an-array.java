class Solution {
    public int triangularSum(int[] nums) {
       return solve(nums,nums.length-1); 
    }
    public int solve(int[] nums,int j){
        if(j==0) return nums[0];
        for(int i=0;i<j;i++){
            nums[i]=(nums[i]+nums[i+1])%10;
        }
        return solve(nums,j-1);

    }
}