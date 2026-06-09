class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalMul=1;
        int count=0;
        for(int num:nums){
            if(num!=0){
                totalMul*=num;
            }else count++;
        }
        int n=nums.length;
        if(count==0){
            for(int i=0;i<n;i++){
                nums[i]=totalMul/nums[i];
            }
        }else if(count==1){
            for(int i=0;i<n;i++){
                if(nums[i]==0) nums[i]=totalMul;
                else nums[i]=0;
            }
        }else{
            for(int i=0;i<n;i++){
                nums[i]=0;
            }
        }
        return nums;
    }
}