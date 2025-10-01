class Solution:
    def triangularSum(self, nums: List[int]) -> int:
        return self.solve(nums,len(nums)-1)

    def solve(self,nums:List[int],j:int)->int:
        if(j==0):
            return nums[0]
        
        for i in range(j):
            nums[i]=(nums[i]+nums[i+1])%10

        return self.solve(nums,j-1)
        