class Solution:
    def isNonZero(self,num:int) -> bool:
        while num>1:
            if num%10==0:
                return False
            num//=10
        return True
    def getNoZeroIntegers(self, n: int) -> List[int]:
        arr=[]
        i=1
        j=n-1
        while i<=j:
            if self.isNonZero(i) and self.isNonZero(j):
                arr.append(i)
                arr.append(j)
                return arr
            else:
                i+=1
                j-=1
       
        return arr
        