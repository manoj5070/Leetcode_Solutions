class Solution {
    public int countValidSelections(int[] nums) {
        int count=0;
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int half=0;
        for(int i=0;i<n;i++){
            half+=nums[i];
             if(nums[i]==0){
                if(half*2==sum) count+=2;
                else if(half==sum/2) count+=1;
                else if(half==(sum+1)/2) count+=1;
            }
        }
        return count;
    }
}