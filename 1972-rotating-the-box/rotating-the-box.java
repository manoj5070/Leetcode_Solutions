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
            for(int i=n-1;i>=0;i--){
                if(ans[i][j]=='.'){
                    int stone=-1;
                    for(int k=i-1;k>=0;k--){
                        if(ans[k][j]=='*') break;
                        else if(ans[k][j]=='#'){
                            stone=k;
                            break;
                        }
                    }
                    if(stone!=-1){
                        ans[i][j]='#';
                        ans[stone][j]='.';
                    }
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