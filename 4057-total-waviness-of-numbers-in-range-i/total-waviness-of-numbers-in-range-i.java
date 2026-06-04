class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
            String str=String.valueOf(i);
            for(int j=1;j<str.length()-1;j++){
                char a=str.charAt(j);
                char b=str.charAt(j-1);
                char c=str.charAt(j+1);
                if((a>b && a>c) || (a<b && a<c)) count++;
            }
        }
        return count;
    }
}