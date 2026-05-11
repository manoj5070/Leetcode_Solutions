class Solution {
    public int[] separateDigits(int[] nums) {
        int n=nums.length;
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s=Integer.toString(nums[i]);
            int j=0;
            while(j<s.length()){
                ls.add(s.charAt(j)-48);
                j++;
            }
        }
        n=ls.size();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}