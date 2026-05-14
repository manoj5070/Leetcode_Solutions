class Solution {
    public int minMoves(int[] nums, int limit) {

        int n=nums.length;
        int result=Integer.MAX_VALUE;

        int[] arr=new int[2*limit+2];
        
        for(int j=0;j<n/2;j++){

            int min=Math.min(nums[j],nums[n-j-1])+1;
            int max=Math.max(nums[j],nums[n-j-1])+limit;

            arr[2]+=2;
            arr[2*limit+1]-=2;

            arr[min]+=-1;
            arr[max+1]-=-1;

            arr[nums[j]+nums[n-j-1]]+=-1;
            arr[nums[n-j-1]+nums[j]+1]-=-1;

    
        }

        for(int i=2;i<=2*limit;i++){
            arr[i]+=arr[i-1];
            result=Math.min(result,arr[i]);
        }

        return result;
    }
}