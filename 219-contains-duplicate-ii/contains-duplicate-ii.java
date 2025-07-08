class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int a=i+k;
            while(a>i){
                if(a<n && nums[i]==nums[a]) return true;
                else a--;
            }
            i++;
        }
        return false;
    }
}