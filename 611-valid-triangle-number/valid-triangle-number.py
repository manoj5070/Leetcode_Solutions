class Solution:
    def triangleNumber(self, nums: List[int]) -> int:
        ans=0
        nums.sort()
        n=len(nums)
        i=0
        print(nums)
        while(i<n-2):
            a=nums[i]
            j=i+1
            while(j<n-1):
                b=nums[j]
                ans+=self.binary(nums,i,j)
                j+=1
            i+=1   
        return ans

    def binary(self,nums:list[int],i:int,j:int)->int:
        k=len(nums)-1
        l=j+1
        a=nums[i]
        b=nums[j]
        while(l<=k):
            mid=(k-l)//2+l
            if a+b>nums[mid]:
                l=mid+1
            else:
                k=mid-1

        return l-j-1



        