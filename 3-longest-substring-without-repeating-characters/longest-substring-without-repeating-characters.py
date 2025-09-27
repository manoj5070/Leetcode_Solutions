class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        map=set()

        ans=0
        j=0
        for i in range(len(s)):
            ch=s[i]
            while(ch in map):
                map.remove(s[j])
                j+=1
            map.add(ch)
            ans=max(ans,len(map))
        return ans

        