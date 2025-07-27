class Solution {
public:
    bool canPlaceFlowers(vector<int>& nums, int n) {
        for(int i=0;i<nums.size();++i){
            if(nums[i]==1) continue;
            int f=0,t=0;
            if(i-1>=0) f=nums[i-1];
            if(i+1<nums.size()) t=nums[i+1];
            if(f==0 && t==0 && n>0) {
                nums[i]=1;
                n--;
            }
        }
        return n==0;
    }
};