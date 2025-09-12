class Solution:
    def doesAliceWin(self, s: str) -> bool:
        st="aeiou"

        for c in s:
            if c in st:
                return True

        return False
        