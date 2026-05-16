class Solution {
    public int findMin(int[] nums) {
         int start=0;
        int end=nums.length-1;
        int min=nums[0];
        while(start<=end){
            while(start<end && nums[start]==nums[start+1]) start++;
            while(start<end && nums[end]==nums[end-1]) end--;
            int mid=(start+end)/2;
            if(nums[mid]>=min) start=mid+1;
            else{
                end=mid-1;
                min=nums[mid];
            }
        }
        return min;
    }
}