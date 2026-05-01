class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum=0;
        int n=nums.length;
        int num=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            num+=(nums[i]*i);
        }
        int max=num;
        for(int i=0;i<n;i++){
            int newSum=num+sum-n*nums[n-1-i];
            max=Math.max(max,newSum);
            num=newSum;
        }
        
        return max;
    }
}