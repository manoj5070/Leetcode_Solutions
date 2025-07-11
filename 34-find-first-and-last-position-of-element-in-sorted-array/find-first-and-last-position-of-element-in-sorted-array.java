class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int mid=0;
        int st=-1;
        int end=-1;
        while(i<=j){
            mid=i+(j-i)/2;
            if(nums[mid]==target){
               st=mid;
            }
            if(nums[mid]>=target) j=mid-1;
            else i=mid+1;
        }
        i=0;
        j=n-1;
        while(i<=j){
            mid=i+(j-i)/2;
            if(nums[mid]==target){
               end=mid;
            }
            if(nums[mid]<=target) i=mid+1;
            else j=mid-1;
        }
        int[] arr={st,end};
        return arr;
    }
}