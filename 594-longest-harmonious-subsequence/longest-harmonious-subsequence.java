class Solution {
    public int findLHS(int[] nums) {
      int count=0;
      Arrays.sort(nums);
      int n=nums.length;
      int j=n-1;
      int i=0;
      while(i<n){
        if(nums[j]-nums[i]==1){
            count=Math.max(count,j-i+1);
            i++;
            j=n-1;
        }else if(nums[j]-nums[i]>1) j--;
        else if(nums[j]==nums[i]){
            i=j+1;
            j=n-1;
        }
        if(j==i){
            j=n-1;
            i++;
        } 
      }
      return count;
    }
}