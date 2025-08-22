class Solution {
    public int minimumArea(int[][] grid) {
        int rowStart=grid.length;
        int columnStart=grid[0].length;
        int rowEnd=-1;
        int columnEnd=-1;
            for(int row=0;row<grid.length;row++){
                for(int column=0;column<grid[0].length;column++){
                if(grid[row][column]==1){
                   rowStart=Math.min(rowStart,row);
                   rowEnd=Math.max(rowEnd,row);
                   columnStart=Math.min(columnStart,column);
                   columnEnd=Math.max(columnEnd,column);
                }
            }
        }
        return (columnEnd-columnStart+1)*(rowEnd-rowStart+1);
    }
}