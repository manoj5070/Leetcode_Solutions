class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sum=0;
        int i=0;
        int j=0;
        int n=nums.length;
        while(i<n && j<n){
            if(j==n-1 && nums[j]==0){
                int m=j-i+1;
                sum+=(((long)m*(long)(m+1))/2);
                break;
            }
            else if(nums[j]==0) j++;
            else{
                int m=j-i;
                sum+=(((long)m*(long)(m+1))/2);
                while( j<n && nums[j]!=0) j++;
                i=j;
            }
        }
        return sum;
    }
}