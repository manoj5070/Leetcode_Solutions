class Solution {
    public int searchInsert(int[] nums, int target) {
        // int i=0;
        // int j=nums.length-1;
        // int mid=i+(j-i)/2;
        // while(i<=j){
        //     if(mid>target) return i;
        //     else if(nums[j]<=target) return j;
        //     else{
        //         i++;
        //         j--;
        //     }
        // }
        // return 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}