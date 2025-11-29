class Solution {
    public int minOperations(int[] nums, int k) {
        int ans=0;
        for(int i:nums){
            ans+=i;
        }
        return ans%k;
    }
}