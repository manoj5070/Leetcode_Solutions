class Solution:
    def nextBeautifulNumber(self, n: int) -> int:
        n+=1
        while True:
            if self.solve(n):
                return n
            n+=1
    def solve(self,a:int) -> int:
        map={}
        while(a>0):
            rem=a%10
            a//=10
            map[rem]=map.get(rem,0)+1
        
        for k,v in map.items():
            if k!=v:
                return False
        
        return True


        