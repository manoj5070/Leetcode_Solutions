class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int j = 0;
        int index = -1;  
        int n = nums.length;
        boolean check = false;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                // \U0001f525 Fix: add (check ? 0 : 1)
                max = Math.max(max, i - j + (check ? 0 : 1));
            } else if (i < n - 1 && nums[i + 1] == 1) {
                if (check) {
                    j = index + 1;
                }
                index = i;           
                check = true;
            } else {
                j = i + 1;
                check = false;
            }
        }

        // no need to change your allOnes check
        boolean allOnes = true;
        for (int num : nums) {
            if (num == 0) {
                allOnes = false;
                break;
            }
        }

        if (allOnes) return n - 1; 
        return max;
    }
}
