class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
             if(nums[j]==target) return j;
             if(nums[i]==target) return i;
            if(nums[j]>target) j--;
            else if(nums[i]<target) i++;
        }
        return i;
    }
}