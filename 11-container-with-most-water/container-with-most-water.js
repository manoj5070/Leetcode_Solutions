/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let i=0;
    let j=height.length;
    let ans=-1;
    while(i<j){
        if(height[i]<height[j]){
            ans=ans<(height[i]*(j-i))?(height[i]*(j-i)):ans;
            i++;
        }else{
             ans=ans<(height[j]*(j-i))?(height[j]*(j-i)):ans;
            j--;
        }
    }
    return ans;
};