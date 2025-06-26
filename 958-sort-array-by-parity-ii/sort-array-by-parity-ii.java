class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
      int[] arr=new int[n];
      int left=0;
      int right=1;  
      for(int i=0;i<n;i++){
        if(nums[i]%2==0){
            arr[left]=nums[i];
            left+=2;
        } 
        else{
            arr[right]=nums[i];
            right+=2;
        } 
      }
      return arr;
    }
}