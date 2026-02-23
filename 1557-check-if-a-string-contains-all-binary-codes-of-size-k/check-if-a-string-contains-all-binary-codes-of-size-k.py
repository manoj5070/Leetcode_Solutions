class Solution:
    def hasAllCodes(self, s: str, k: int) -> bool:
        set1={s[i:i+k] for i in range(len(s)-k+1)}
        return len(set1)==1<<k
        