class Solution:
    def maxFreqSum(self, s: str) -> int:
        vow=0
        con=0
        set_def=set(s)

        for ch in set_def:
            if ch in "aeiou":
                vow=max(vow,s.count(ch))
            else:
                con=max(con,s.count(ch))
        return vow+con
        