class Solution {
    int newColor=0;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        newColor=image[sr][sc];
        if(newColor==color) return image;
        DFS(image,sr,sc,color);
        return image;
    }
    private void DFS(int[][] image,int row,int col,int color){
        if(row<0 || row>image.length-1 || col<0 || col>image[0].length-1) return;
        if(image[row][col]!=newColor) return;
        image[row][col]=color;
        DFS(image,row+1,col,color);
        DFS(image,row,col+1,color);
        DFS(image,row-1,col,color);
        DFS(image,row,col-1,color);
        return;
    }
}