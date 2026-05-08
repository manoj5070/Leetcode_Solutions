class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m=boxGrid.length;
        int n=boxGrid[0].length;
        char[][] ans=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=boxGrid[j][i];
            }
        }
        for(int i=0;i<n;i++){
            reverse(ans[i]);
        }
        for(int j=0;j<m;j++){
            int stone=n-1;
            for(int i=n-1;i>=0;i--){
                if(ans[i][j]=='*'){
                   stone=i-1;
                }
                else if(ans[i][j]=='#'){
                    ans[i][j]='.';
                    ans[stone][j]='#';
                    stone--;
                }
            }
        }
        return ans;
    }
    public void reverse(char[] row){
        int left=0;
        int right=row.length-1;
        while(left<right){
            char temp=row[left];
            row[left]=row[right];
            row[right]=temp;
            left++;
            right--;
        }
    }
}