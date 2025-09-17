class Solution:
    def mySqrt(self, x: int) -> int:
        if x<2:
            return x

        a=1
        left=1
        right=x//2

        while left<=right:
            mid= (right-left)//2+left
            square=mid*mid
            if((square)==x):
                return mid
            elif square<x:
                left=mid+1
            else:
                right=mid-1
        
        return right
        