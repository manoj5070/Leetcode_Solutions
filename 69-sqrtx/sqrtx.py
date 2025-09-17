class Solution:
    def mySqrt(self, x: int) -> int:
        if x<2:
            return x

        a=1
        while((a*a)<x):
            a+=1
        
        if((a*a)==x):
            return a
        else:
            return a-1
        