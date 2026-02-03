/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    let n=digits;
    let m=digits.length;
    let num=digits[m-1];
    if(num===9){
        while(num==9 && m>0){
        num=n[m-1];
        m--;
        }
        console.log(num);
        console.log(m);
        if(num===9){
            const arr=[];
            arr.push(1);
            for(let j=0;j<digits.length;j++) arr.push(0);
            return arr;
        }else{
            const arr=[];
            for(let j=0;j<m;j++){
                arr[j]=digits[j];
            }
            arr[m]=digits[m]+1;
            for(let j=m+1;j<digits.length;j++) arr[j]=0;
            return arr;
        }
    }
    digits[m-1]=digits[m-1]+1;

    return digits;
};