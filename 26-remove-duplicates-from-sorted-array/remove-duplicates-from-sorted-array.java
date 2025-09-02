class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            nums[k]=nums[i];
            if(i<nums.length-1 && nums[k]!=nums[i+1]) k++;
            // else if(nums[k])
        }
        return k+1;
    }
}