class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        maps={}
        for i in range(len(nums)):
            val=target-nums[i]
            if val in maps:
                return [maps[val],i]

            maps[nums[i]]=i


            
                
        