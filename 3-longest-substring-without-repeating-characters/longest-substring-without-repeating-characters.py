class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        map=set()

        ans=0
        j=0
        for i in range(len(s)):
            ch=s[i]
            if(ch in map):
                ans=max(ans,len(map))
                while(ch in map):
                    map.remove(s[j])
                    j+=1
                map.add(ch)
            else:
                map.add(ch)
                ans=max(ans,len(map))
        return ans
