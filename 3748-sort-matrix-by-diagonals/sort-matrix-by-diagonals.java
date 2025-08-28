class Solution {
    int n=0;
    public int[][] sortMatrix(int[][] grid) {
        n=grid.length;
        for(int i=0;i<n;i++){
                sortReverse(grid,i,0);
        }
        for(int j=1;j<n;j++){
            sort(grid,0,j);
        }
        return grid;
    }
    public void sortReverse(int[][] grid,int i,int j){
        List<Integer> ls=new ArrayList<>();
        int i_=i;
        int j_=j;
        while(i<n && j<n){
            ls.add(grid[i][j]);
            i++;
            j++;
        }
        Collections.sort(ls);
        Collections.reverse(ls);

       for(int num:ls){
        grid[i_++][j_++]=num;
       }
    }
    public void sort(int[][] grid,int i,int j){
        List<Integer> ls=new ArrayList<>();
        int i_=i;
        int j_=j;
        while(i<n && j<n){
            ls.add(grid[i][j]);
            i++;
            j++;
        }
        Collections.sort(ls);

       for(int num:ls){
        grid[i_++][j_++]=num;
       }
    }
}