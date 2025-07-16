class Solution {
    public int maximumLength(int[] nums) {
       int n=nums.length;
       int evenCount=0;
       int oddCount=0;
       for(int i=0;i<n;i++){
        if(nums[i]%2==0) evenCount++;
        if(nums[i]%2!=0) oddCount++;
       }
       int i=0;
       int j=1;
       int oddEvenCount=1;
       while(i<n && j<n){
        if((nums[i]+nums[j])%2!=0){
            oddEvenCount++;
            i=j;
            j++;
        }else{
            j++;
        }
       }
        i=0;
        j=1;
       int evenOddCount=1;
       while(i<n && j<n){
        if((nums[i]+nums[j])%2==0){
            evenOddCount++;
            i=j;
            j++;
        }else{
            j++;
        }
       }
    int max=Math.max(Math.max(oddEvenCount,evenOddCount),Math.max(evenCount,oddCount));
    return max;
    }
}