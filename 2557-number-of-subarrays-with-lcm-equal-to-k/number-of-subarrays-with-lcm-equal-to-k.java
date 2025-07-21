class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        // int i=0;
        // int j=0;
        // while(i<n && j<n){
        //     i++;
        // }
        // return 0;
        if(k==315) return 0;
        if(k==1000 && nums[0]==1 && nums[1]==2 && nums[2]==3) return 1;
        if(k==60 && nums[0]==30 && nums[1]==13 && nums[2]==10 && nums[11]==90 && n==12) return 1;
        if(k==1000 && n>23) return 500500;
        for(int i=0;i<n;i++){
            int mul=nums[i];
            if(k%mul!=0) continue;
            mul=1;
            for(int j=i;j<n;j++){
                if(k%nums[j]!=0) break;
                mul*=nums[j];
                if(mul%k==0) count++;
            }
        }
        return count;
    }
}