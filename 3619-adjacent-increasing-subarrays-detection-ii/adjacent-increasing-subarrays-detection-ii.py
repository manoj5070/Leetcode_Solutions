class Solution:
    def maxIncreasingSubarrays(self, nums: List[int]) -> int:
        pre=0
        cur=1
        k=0
        for i in range(1,len(nums)):
            if nums[i]>nums[i-1]:
                cur+=1
            else:
                pre=cur
                cur=1
            k=max(k,cur//2)
            k=max(k,min(pre,cur))
        return k
        