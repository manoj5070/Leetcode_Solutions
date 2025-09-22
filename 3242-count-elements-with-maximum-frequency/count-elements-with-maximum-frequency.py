class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        arr=[0]*101

        mx=0

        for i in nums:
            arr[i]+=1
            mx=max(arr[i],mx)
        
        if mx==1:
            return len(nums)

        ans=0
        for i in arr:
            if i!=0:
                if i==mx:
                    ans+=mx
            
        return ans
        