class Solution(object):
    def smallestNumber(self, n):
        """
        :type n: int
        :rtype: int
        """
        x=n
        while((x&(x+1))!=0):
            x+=1
        return x
        