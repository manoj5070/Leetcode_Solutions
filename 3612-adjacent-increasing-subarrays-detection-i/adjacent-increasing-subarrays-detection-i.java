class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n=nums.size();
        int i=0;
        while(i<=n-(2*k)){
            if(possible(nums,i,k)) return true;
            i++;
        }
        return false;
    }
    public boolean possible(List<Integer> nums,int i,int k){
        for(int j=1;j<k;j++){
            if(nums.get(j+i)<=nums.get(j+i-1)) return false;
            if(nums.get(j+i+k)<=nums.get(j+k+i-1)) return false;
        }
        return true;
    }
}