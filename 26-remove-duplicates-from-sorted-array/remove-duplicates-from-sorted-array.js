/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let val=nums[0];
    let j=1;
    for(let i=1;i<nums.length;i++){
        if(val===nums[i]){
            continue;
        }else{
             nums[j]=nums[i];
             val=nums[j];
             j++;
        }
    }
    return j;
};