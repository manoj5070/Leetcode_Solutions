class Solution {
    public int maxSum(int[] nums) {
        int i=1;
        Arrays.sort(nums);
        int sum=nums[0];
        int pre =sum;
        while(i<nums.length){
            if((nums[i]+sum)>sum && pre!=nums[i]){
                 sum=sum+nums[i];
                if(nums[i]>sum) sum=nums[i];
                 pre=nums[i];
            }else if(sum<nums[i]) sum=nums[i];
            i++;
        }
        return sum;
    }
}