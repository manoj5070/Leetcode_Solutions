class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:

        ans=numBottles
        n=numBottles
        m=numExchange
        while(n>=m):
            rem=n%m
            div=n//m
            ans+=div
            n//=m
            n=n+rem
        
        return ans

        