class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int k=0;
        int j=1;
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[k]=nums[i];
                k+=2;
            }
            else{
                arr[j]=nums[i];
                j+=2;
            }
        }
        return arr;
    }
}