class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        int maxElement=-1;
        Arrays.sort(nums);
        if(nums[n-1]!=n-1 || n<nums[n-1]+1) return false;
        for(int i=0;i<n-
        1;i++){
            if(i+1!=nums[i]) return false;
        }
        return true;
    }
}