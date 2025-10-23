class Solution:
    def hasSameDigits(self, s: str) -> bool:
        while len(s)>2:
            st=""
            for i in range(1,len(s)):
                a=int(s[i-1])+int(s[i])
                a%=10
                st+=str(a)
                print(a)
            s=st
        
        return s[0]==s[1]


        