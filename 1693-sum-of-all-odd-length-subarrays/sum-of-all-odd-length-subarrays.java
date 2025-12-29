class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       int n=arr.length;
       int[] sum=new int[n];
       sum[0]=arr[0];
       for(int i=1;i<n;i++){
        sum[i]+=arr[i]+sum[i-1];
       } 
       int ans=0;
       for(int i=0;i<n;i++){
        for(int j=i;j<n;j+=2){
                ans+=sum[j]-sum[i]+arr[i];
        }
       }
       return ans;
    }
}