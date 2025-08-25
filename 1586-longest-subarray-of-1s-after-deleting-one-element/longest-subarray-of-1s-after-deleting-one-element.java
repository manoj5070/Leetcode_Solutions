class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int max=-1;
        int zeros=0;
        while(j<nums.length){
            if(nums[j]==0) zeros++;
            while(zeros>1){
                if(nums[i]==0) zeros--;
                i++;
            }
            if(zeros>0){
                max=Math.max(max,j-i);
            }else max=Math.max(max,j-i+1);
            j++;
        }
        return max==nums.length?max-1:max;
    }
}