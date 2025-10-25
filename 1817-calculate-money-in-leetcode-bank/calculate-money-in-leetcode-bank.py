class Solution:
    def totalMoney(self, n: int) -> int:
        a=n//7
        b=0
        sum=0
        while a>0:
            b+=1
            for i in range(b,b+7):
                sum+=i
            a-=1
        
        for i in range(b+1,b+1+n%7):
            sum+=i
        return sum
            
        