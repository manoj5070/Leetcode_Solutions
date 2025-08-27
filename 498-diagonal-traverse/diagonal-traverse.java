class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
      List<List<Integer>> ls=new ArrayList<>();
      int n=mat.length;
      int m=mat[0].length;
      for(int i=0;i<n+m-1;i++){
        ls.add(i,new ArrayList<>());
      }

      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            ls.get(i+j).add(mat[i][j]);
        }
      }  
      int[] ans=new int[m*n];

        int j=0;
        int ind=0;
      for(List<Integer> l:ls){
        if(j%2==0){
            int st=0;
            int end=l.size()-1;
            while(st<end){
                int temp=l.get(end);
                l.set(end,l.get(st));
                l.set(st,temp);
                st++;
                end--;
            }
        }
        for(int i=0;i<l.size();i++){
            ans[ind++]=l.get(i);
        }
        j++;
      }
      return ans;
    }
}