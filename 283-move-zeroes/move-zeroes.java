class Solution {
    public void moveZeroes(int[] nums) {
       int i=0;
       int n=nums.length;
       int c=0;
       for(int j=0;j<n;j++){
        // if(i+c+1==n) break;
        if(nums[j]==0) c++;
        else nums[i++]=nums[j];
       } 
       while(i<n) nums[i++]=0;
    }
}