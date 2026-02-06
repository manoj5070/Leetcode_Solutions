/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function (strs) {
 const n=strs[0].length;
 let ans="";
 for(let i=0;i<n;i++){
    let ch=strs[0][i];
    for(let j=1;j<strs.length;j++){
        if(ch!=strs[j][i]) return ans;
    }
        ans+=ch;
 }
//  if(ans=="") return "";
 return ans;
};