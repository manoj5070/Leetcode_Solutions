class Solution:
    def sumZero(self, n: int) -> List[int]:
        ls=[]

        for i in range(1,int(n/2)+1):
            ls.append(i)
            ls.append(-i)



        if n%2!=0:
            ls.append(0)

        return ls