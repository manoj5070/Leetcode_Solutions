class Solution:
    def sumZero(self, n: int) -> List[int]:
        ls=[]

        if n%2==0:
            for i in range(1,int(n/2)+1):
                ls.append(i)
            for i in range(1,int(n/2)+1):
                ls.append(-i)
        else:
            ls.append(0)
            for i in range(1,int(n/2)+1):
                ls.append(i)
            for i in range(1,int(n/2)+1):
                ls.append(-i)

        return ls