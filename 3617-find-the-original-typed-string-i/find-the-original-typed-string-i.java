class Solution {
    public int possibleStringCount(String word) {
        int sum=0;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i-1)==word.charAt(i)) sum++;
        }
        return sum+1;
    }
}