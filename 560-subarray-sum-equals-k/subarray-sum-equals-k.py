class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:

        maps={0:1}
        count=0
        pre=0


        for num in nums:
            pre+=num
            if pre-k in maps:
                count+=maps.get(pre-k)
            maps[pre]=maps.get(pre,0)+1
        return count
        