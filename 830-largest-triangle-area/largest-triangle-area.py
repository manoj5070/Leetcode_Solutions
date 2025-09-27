class Solution:
    def largestTriangleArea(self, points: List[List[int]]) -> float:

        ans=0.0
        n=len(points)

        for i in range(len(points)-2):
           x1,y1=points[i]
           for j in range(n-1):
            x2,y2=points[j]
            for k in range(n):
                x3,y3=points[k]
                area=abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2)))/2
                # print(area)
                ans=max(ans,area)
        
        return ans