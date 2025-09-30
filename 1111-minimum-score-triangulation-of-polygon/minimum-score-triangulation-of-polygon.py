from functools import lru_cache
from typing import List

class Solution:
    def minScoreTriangulation(self, values: List[int]) -> int:
        n = len(values)

        @lru_cache(None)   # memoization
        def solve(i: int, j: int) -> int:
            if j - i + 1 < 3:
                return 0
            result = float('inf')
            for k in range(i+1, j):
                ans = values[i] * values[j] * values[k] + solve(i, k) + solve(k, j)
                result = min(result, ans)
            return result

        return solve(0, n-1)
