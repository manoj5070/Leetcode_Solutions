/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x<0) return false;
    const str=x+'';
    const n=str.length;
    let i=0;
    let j=n-1;
    while(i<n && j<n){
        if(str[i]!==str[j]) return false;
        i++;
        j--;
    }
    return true;
};