class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        int i=1;
        int j=n-2;
        while(i<j){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]) return i;
            if(nums[j]>nums[j-1] && nums[j]>nums[j+1]) return j;
            i++;
            j--;
        }
        return i;
    }
}