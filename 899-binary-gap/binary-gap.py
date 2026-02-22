class Solution:
    def binaryGap(self, n: int) -> int:
        one_Count=0
        zero_Count=0
        Max=-1
        while(n>0):
            if(n%2==1 and  one_Count!=0):
                Max=max(zero_Count+1,Max)
                zero_Count=0
            else:
                if(n%2==1):
                    one_Count=1
                    zero_Count=0
                else:
                    zero_Count+=1
            n//=2
        return  Max if Max > 0 else 0
                    



        