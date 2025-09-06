class Solution:
    def maxArea(self, height: List[int]) -> int:
        i=0
        j=len(height)-1

        val=-1
        while i<=j:
            val=max(val,min(height[i],height[j])*(j-i))
            if height[i]<height[j]:
                i+=1
            else:
                j-=1

        return val


        