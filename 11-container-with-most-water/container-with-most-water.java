class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int max=-1;
        while(i<=j){
            max=Math.max(max,(Math.min(height[i],height[j])*(j-i)));
            if(height[i]<height[j]) i++;
            else j--;
        }
        return max;
    }
}