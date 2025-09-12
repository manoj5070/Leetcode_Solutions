class Solution {
    public boolean doesAliceWin(String s) {
        String str="aeiou";
        for(char c:s.toCharArray()){
            if(str.indexOf(c)!=-1) return true;
        }
        return false;       
    }
}