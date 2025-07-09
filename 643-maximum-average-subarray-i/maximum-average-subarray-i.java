class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=0;
        int i=0,j=0;
        int n=nums.length;
        while(j<k){
            max+=nums[j];
            j++;
        }
        if(n==k) return (double)max/k;
        int temp=max;
        while(j<n){
            temp-=nums[i];
            temp+=nums[j];
            max=Math.max(temp,max);
            i++;
            j++;
        }
        return (double)max/k;
    }
}