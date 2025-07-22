class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        int j=0;
        int i=0;
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        int currentSum=0;
        while(i<n && j<n){
            int num=nums[j];
            if (map.containsKey(num)) {
                while (nums[i] != num) {
                    map.remove(nums[i]);
                    currentSum -= nums[i];
                    i++;
                }
                map.remove(nums[i]);
                currentSum -= nums[i];
                i++;
            }
            map.put(num, j);
            currentSum += num;
            max = Math.max(max, currentSum);
            j++;
        }



        return max;
    }
}