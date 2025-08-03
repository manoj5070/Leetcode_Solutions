class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0;

        int i=0;
        int j=0;
        int n=nums.length;
        int pre=nums[0];
        int sum=0;

        while(j<k){
            sum+=nums[j];
            j++;
        }

        ans=(double)sum/k;

        while(j<n){
            sum+=nums[j];
            sum-=nums[i];
            i++;
            j++;
            ans=Math.max(ans,((double)sum/k));
        } 
        return ans;
    }
}