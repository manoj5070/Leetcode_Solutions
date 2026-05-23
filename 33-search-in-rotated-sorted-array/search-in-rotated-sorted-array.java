class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int i=0,j=n-1;
        while(i<j){
            int mid=(i+j)/2;
            if(nums[mid]>nums[j]) i=mid+1;
            else j=mid;
        }
        int idx=binarySearch(0,j-1,nums,target);
        if(idx!=-1) return idx;
        idx=binarySearch(j,n-1,nums,target);
        return idx;
    }
    public int binarySearch(int start,int end,int[] arr,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target) return mid;
            if(target>arr[mid]) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
}