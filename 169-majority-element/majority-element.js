/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    const mapC=new Map();
    for(let i=0;i<nums.length;i++){
        mapC.set(nums[i],(mapC.get(nums[i])||0)+1);
    }
    let ans=[0,-1];
    for(let [key,value] of mapC){
        if(value>ans[1]){
             ans[0]=key;
             ans[1]=value;
        }
    }
    return ans[0];
};