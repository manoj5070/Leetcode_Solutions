class Solution {
    public int countHillValley(int[] nums) {
       int count=0;
       int n=nums.length;
       List<Integer> ls=new ArrayList<>();
       ls.add(nums[0]);
       for(int i=0;i<n-1;i++){
        if(nums[i]==nums[i+1]) continue;
        else ls.add(nums[i+1]);
       }
       for(int i=1;i<ls.size()-1;i++){
        if(((ls.get(i)<ls.get(i-1)) && (ls.get(i)<ls.get(i+1))) ||
         ((ls.get(i)>ls.get(i-1)) && (ls.get(i)>ls.get(i+1)))){
            count++;
        }
       }

       return count;
    }
}