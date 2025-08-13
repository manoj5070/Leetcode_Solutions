class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int sI=0;
        int sJ=0;
        int eI=n-1;
        int eJ=m-1;
        List<Integer> ls=new ArrayList<>();
        while(sJ<=eJ && sI<=eI){
            for(int i=sJ;i<=eJ;i++){
                ls.add(matrix[sI][i]);
            }
            sI++;
            for(int i=sI;i<=eI;i++){
                ls.add(matrix[i][eJ]);
            }
            eJ--;
            if(sI<=eI){
                for(int i=eJ;i>=sJ;i--){
                ls.add(matrix[eI][i]);
                }
                eI--;
            }
            if(sJ<=eJ){
            for(int i=eI;i>=sI;i--){
                ls.add(matrix[i][sJ]);
            }
            sJ++;
            }
        }
        return ls;
    }
}