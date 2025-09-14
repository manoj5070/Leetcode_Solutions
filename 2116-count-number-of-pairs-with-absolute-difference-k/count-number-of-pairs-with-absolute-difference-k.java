class Solution {
    public int countKDifference(int[] nums, int k) {
        // Arrays.sort(nums);

        int n=nums.length;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(nums[i]-nums[j])==k) count++;
                System.out.print(nums[i]-nums[j]);
            }
        }
        return count;
    }
}