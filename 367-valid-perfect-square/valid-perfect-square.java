class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2) return true;
        for(int i=num/2;i>=1;i--){
            if(i*i==num) return true;
        }
        return false;
    }
}