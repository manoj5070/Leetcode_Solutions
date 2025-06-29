class Solution {
    public int numSubseq(int[] nums, int target) {
        // int count=0;
        int n=nums.length;
        int M=(int)1e9+7;
        Arrays.sort(nums);
        int sum=0;
        int l=0;
        int r=n-1;
        int[] arr=new int[n];
        arr[0]=1;
        for(int i=1;i<n;i++){
            arr[i]=(arr[i-1]*2)%M;
        }
       while(l<=r){
        if(nums[l]+nums[r]<=target){
            sum=sum%M+(arr[r-l])%M;
            l++;
        }else r--;
       }
        return sum;
    }
}