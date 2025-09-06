class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        count=0
        if(len(s)==0):
            return True
        i=0
        for c in t:
            if(c==s[i]):
                i+=1
            if i==len(s):
                return True
        return False
        