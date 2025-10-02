class Solution:
    def maxBottlesDrunk(self, numBottles: int, numExchange: int) -> int:
        ans=numBottles
        canDrink=numBottles
        while(canDrink>=numExchange):
            ans+=1
            canDrink-=numExchange-1
            numExchange+=1
            
        
        return ans