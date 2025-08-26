class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int rowsLength=dimensions.length;

        double diagonal=Math.sqrt(dimensions[0][0]*dimensions[0][0]+dimensions[0][1]*dimensions[0][1]);
        int area=dimensions[0][0]*dimensions[0][1];

        for(int i=1;i<rowsLength;i++){
            double newDiagonal=Math.sqrt(dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1]);
            int newArea=dimensions[i][0]*dimensions[i][1];
            if(diagonal<newDiagonal){
                diagonal=newDiagonal;
                area=newArea;
            }else if(diagonal==newDiagonal){
                if(area<newArea){
                    diagonal=newDiagonal;
                    area=newArea;
                }
            }
        }
        return area;
    }
}