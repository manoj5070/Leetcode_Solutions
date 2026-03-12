class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums,0,nums.length-1);
        return nums;
    }
    public void divide(int[] nums,int start,int end){
        if(start==end) return;
        int mid=start+(end-start)/2;
        divide(nums,start,mid);
        divide(nums,mid+1,end);
        merge(nums,start,mid,end);
    }
    public void merge(int[] nums,int start,int mid,int end){
        int left=start,right=mid+1,i=0;
        int[] temp=new int[end-start+1];
        while(left<=mid && right<=end){
            if(nums[left]<=nums[right]){
                temp[i++]=nums[left++];
            }else temp[i++]=nums[right++];
        }
        while(left<=mid) temp[i++]=nums[left++];
        while(right<=end) temp[i++]=nums[right++];
        i=0;
        while(start<=end) nums[start++]=temp[i++];
    }
}