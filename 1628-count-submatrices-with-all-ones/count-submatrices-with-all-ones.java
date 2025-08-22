class Solution {
    public int numSubmat(int[][] mat) {
        int rows=mat.length;
        int columns=mat[0].length;
        int result=0;

        for(int i=0;i<rows;i++){
            int[] arr=new int[columns];
            Arrays.fill(arr,1);
            for(int j=i;j<rows;j++){

                for(int k=0;k<columns;k++){
                    arr[k]=mat[j][k]&arr[k];
                }

                result+=onesArrayCount(arr);

            }
        }
        return result;
    }
    public int onesArrayCount(int[] arr){
        int sum=0;
        int con=0;
        for(int num:arr){
            if(num==0){
                con=0;
            }else con++;

            sum+=con;
        }
        return sum;
    }
}