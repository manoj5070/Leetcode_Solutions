class Solution:
    def findSmallestInteger(self, nums: List[int], value: int) -> int:
        n=len(nums)
        map={}
        k=value
        for val in nums:
            val%=k
            map[val] = map.get(val, 0) + 1
        i=0
        print(map)
        while(True):
            if i in map:
                map[i]=map.get(i)-1
                if map[i]==0:
                    del map[i]
            elif i%k in map:
                map[i%k]=map.get(i%k)-1
                if map[i%k]==0:
                    del map[i%k]
            else:
                return i
            i+=1
        return ans




        



        