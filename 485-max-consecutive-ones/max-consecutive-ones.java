class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int j=0;
        int n=nums.length;
        int max=-1;

        while(j<n){
            if(nums[j]==1 && j==n-1){
                 max=Math.max(max,j-i+1);
                 break;
            }
            else if(nums[j]==0){
                max=Math.max(max,j-i);
                i=j;
                while(i<n && nums[i]!=1) i++;
                j=i;
            }else j++;

            
        }
        return max;
    }
}