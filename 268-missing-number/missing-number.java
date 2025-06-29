class Solution {
    public int missingNumber(int[] nums) {
       int j=nums.length;
       for(int i=0;i<nums.length;i++){
        j^=i^nums[i]    ;
       }
       return j;
    }
}